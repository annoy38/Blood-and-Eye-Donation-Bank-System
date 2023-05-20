package com.blood.organization.bloodorganization.service;

import com.blood.organization.bloodorganization.entity.*;
import com.blood.organization.bloodorganization.externalApi.IAccountDeleteAndUpdate;
import com.blood.organization.bloodorganization.externalApi.IBloodDataSendToAdminService;
import com.blood.organization.bloodorganization.repository.IBloodRequestRepository;
import com.blood.organization.bloodorganization.repository.IDeliveryRequestRepository;
import com.blood.organization.bloodorganization.repository.IAccountRepository;
import com.blood.organization.bloodorganization.repository.IDonarInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ImpServiceClass implements IService{

    @Autowired
    private IAccountRepository iAccountRepository;
    @Autowired
    private IDonarInfoRepository iDonarInfoRepository;
    @Autowired
    private IDeliveryRequestRepository deliveryRequestRepository;
    @Autowired
    private IBloodRequestRepository iBloodRequestRepository;
    @Autowired
    private ImplEmailServiceClass implEmailServiceClass;
    @Autowired
    private IBloodDataSendToAdminService iBloodDataSendToAdminService;

    @Autowired
    private IAccountDeleteAndUpdate iAccountDeleteAndUpdate;
    LocalDate date = LocalDate.now();

    @Override
    public void delete_account(String accountEmail) {
        //delete all info from blood service
        iAccountRepository.deleteByAccountEmail(accountEmail);
        iDonarInfoRepository.deleteAllByBloodOrganizationId(getDetailes(accountEmail).getAccountId());
        //delete all info from admin service
        iBloodDataSendToAdminService.deleteBloodOrganization(accountEmail);
        iBloodDataSendToAdminService.deleteAllBloodDonors(getDetailes(accountEmail).getAccountId());
        //delete all info from auth service
        iAccountDeleteAndUpdate.deleteAccount(accountEmail);
    }

    @Override
    public void update_account(AccountClass accountClass, String accountEmail) {
        AccountClass accountClass1 = getDetailes(accountEmail);
        accountClass1.setAccountName(accountClass.getAccountName());
        accountClass1.setAccountNumber(accountClass.getAccountNumber());
        accountClass1.setAccountEmail(accountClass.getAccountEmail());
        accountClass1.setAccountDivision(accountClass.getAccountDivision());
        accountClass1.setAccountDistric(accountClass.getAccountDistric());
        accountClass1.setAccountUpazila(accountClass.getAccountUpazila());
        iAccountRepository.save(accountClass1);
    }

    @Override
    public String save_donar_info(DonarInfoClass donarInfoClass, String accountEmail) {
        String randomUUID = UUID.randomUUID().toString();
        donarInfoClass.setDonarId(randomUUID);
        donarInfoClass.setBloodOrganizationId(getDetailes(accountEmail).getAccountId());
        iDonarInfoRepository.save(donarInfoClass);
        iBloodDataSendToAdminService.saveDonors(donarInfoClass);
        return "Data Save Successfully";
    }

    @Override
    public BloodOrganizationClass getAllDonors(String accountEmail) {
        AccountClass accountClass = getDetailes(accountEmail);
        List<DonarInfoClass> donors = iDonarInfoRepository.findByBloodOrganizationId(accountClass.getAccountId());
        BloodOrganizationClass bloodOrganizationClass = new BloodOrganizationClass(
                accountClass.getAccountName(),
                accountClass.getAccountNumber(),
                accountClass.getAccountEmail(),
                accountClass.getAccountDivision(),
                accountClass.getAccountDistric(),
                accountClass.getAccountUpazila(),
                donors.stream().map(d-> new DonarInfoClass(
                        d.getDonarId(),
                        d.getBloodOrganizationId(),
                        d.getDonarName(),
                        d.getDonarEmail(),
                        d.getDonarAge(),
                        d.getDonarGender(),
                        d.getDonarAddress(),
                        d.getDonarBloodType(),
                        d.getLocalDate(),
                        d.getStatus()
                        )).collect(Collectors.toList())
        );
        return bloodOrganizationClass;
    }

    @Override
    public List<DonarInfoClass> four_month_completed_donor(String accountEmail) {
        List<DonarInfoClass> donors = iDonarInfoRepository.findByBloodOrganizationId(getDetailes(accountEmail).getAccountId())
                .stream()
                .filter((d)-> find_difference(d.getLocalDate(), date)>=4)
                .collect(Collectors.toList());
        donors.forEach(d->d.setStatus("DEACTIVE"));
        iDonarInfoRepository.saveAll(donors);
        return donors;
    }

    @Override
    public void send_message_donar(String accountEmail) {
        iDonarInfoRepository.findByStatus("DEACTIVE")
                .forEach(donarInfoClass -> implEmailServiceClass
                        .sendSimpleMail(new EmailDetailsClass(donarInfoClass.getDonarEmail(), accountEmail)));
    }

    @Override
    public void delete_donor(String donarId) {
        iDonarInfoRepository.deleteByDonarId(donarId);
    }

    @Override
    public ProfileClass profile(String accountEmail) {
        AccountClass accountClass = getDetailes(accountEmail);
        ProfileClass profileClass = new ProfileClass(accountClass.getAccountName(),
                accountClass.getAccountNumber(), accountClass.getAccountEmail(),
                accountClass.getAccountDivision(), accountClass.getAccountDistric(),
                accountClass.getAccountUpazila());
        return profileClass;
    }

    @Override
    public void sendBloodRequest(BloodRequestClass bloodRequestClass) {
        iBloodRequestRepository.save(bloodRequestClass);
    }

    @Override
    public List<NotificationClass> notification(String accountEmail) {
        List<NotificationClass> notificationClasses = iBloodRequestRepository.findByBloodOrganizationEmail(getDetailes(accountEmail).getAccountId())
                .stream()
                .map(n-> new NotificationClass(
                        n.getPatientName(),
                        n.getPatientNumber(),
                        n.getPatientAddress(),
                        n.getRequestBloodType())
                ).collect(Collectors.toList());
        return notificationClasses;
    }

    @Override
    public String deliveryrequest(DeliveryRequestClass deliveryRequestClass, String accountEmail) {
        String randomUUID = UUID.randomUUID().toString();
        deliveryRequestClass.setDeliverId(randomUUID);
        deliveryRequestClass.setOrganizationId(getDetailes(accountEmail).getAccountId());
        deliveryRequestClass.setOrganizationName(getDetailes(accountEmail).getAccountName());
        deliveryRequestClass.setOrganizationNumber(getDetailes(accountEmail).getAccountNumber());
        deliveryRequestClass.setOrganizationLocation(getDetailes(accountEmail).getAccountDistric());
        deliveryRequestRepository.save(deliveryRequestClass);
        iBloodDataSendToAdminService.send_delivery_request(deliveryRequestClass);
        return "Send Dellivery Request";
    }
    @Override
    public List<DeliveryRequestClass> allDeliveryRequest(String accountEmail) {
        return deliveryRequestRepository.findByOrganizationId(getDetailes(accountEmail).getAccountId());
    }

    private int find_difference(LocalDate firstDate, LocalDate secondDate){
        Period difference = Period.between(firstDate, secondDate);
        int differenceMonth = difference.getMonths();
        return differenceMonth;
    }

    private AccountClass getDetailes(String accountEmail){
        return iAccountRepository.findByAccountEmail(accountEmail);
    }
}
