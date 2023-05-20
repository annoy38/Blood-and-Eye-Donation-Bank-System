package com.admin.service.AdminService.service;

import com.admin.service.AdminService.entity.*;
import com.admin.service.AdminService.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@ComponentScan("IService")
@Service
public class ImpServiceClass implements IService{

    @Autowired
    private IDeliveryRequestRepository deliveryRequestRepository;

    @Autowired
    private IOrganizationInfoRepository iOrganizationInfoRepository;

    @Autowired
    private IDonorsInfoRepository iDonorsInfoRepository;

    @Autowired
    private IEyeOrganizationInfoRepository iEyeOrganizationInfoRepository;

    @Autowired
    private IEyeDonorRepository iEyeDonorRepository;

    @Override
    public List<BloodOrganizationClass> allOrganization() {
        return null;
    }

    @Override
    public void getRequest(DeliveryRequestsClass deliveryRequestsClass) {
        deliveryRequestRepository.save(deliveryRequestsClass);
    }

    @Override
    public List<DeliveryRequestsClass> getAllRequest() {
        return deliveryRequestRepository.findAll();
    }

    @Override
    public void saveOrganizationInfo(OrganizationsInfoClass organizationsInfoClass) {
        iOrganizationInfoRepository.save(organizationsInfoClass);
    }

    @Override
    public void deleteBloodOrg(String accountEmail) {
        iOrganizationInfoRepository.deleteByAccountEmail(accountEmail);
    }

    @Override
    public void saveDonorsInfo(DonorInfoClass donorInfoClass) {
        iDonorsInfoRepository.save(donorInfoClass);
    }

    @Override
    public void deleteAllDonors(String bloodOrganizationId) {
        iDonorsInfoRepository.deleteAllByBloodOrganizationId(bloodOrganizationId);
    }

    @Override
    public List<OrganizationsInfoClass> getAllOrganization() {
        return iOrganizationInfoRepository.findAll();
    }

    @Override
    public List<OrganizationsInfoClass> getDivisionOrganizations(String organizationDivision) {
        return iOrganizationInfoRepository.findByAccountDivision(organizationDivision);
    }

    @Override
    public List<OrganizationsInfoClass> getDistricOrganizations(String organizationDistric) {
        return iOrganizationInfoRepository.findByAccountDistric(organizationDistric);
    }

    @Override
    public List<OrganizationsInfoClass> getUpazilaOrganizations(String organizationUpazila) {
        return iOrganizationInfoRepository.findByAccountUpazila(organizationUpazila);
    }

    @Override
    public long totalNumberOfBloodOrganizations() {
        long totalOrganization=0;
        totalOrganization = iOrganizationInfoRepository.findAll().stream().count();
        return totalOrganization;
    }

    @Override
    public long totalNumberOfBloodDonors() {
        long totalDonors = 0;
        totalDonors = iDonorsInfoRepository.findAll().stream().count();
        return totalDonors;
    }

    @Override
    public void saveEyeOrganizationInfo(EyeOrganizationInfoClass eyeOrganizationInfoClass) {
        iEyeOrganizationInfoRepository.save(eyeOrganizationInfoClass);
    }

    @Override
    public void deleteEyeOrganization(String accountEmail) {
        iEyeOrganizationInfoRepository.deleteByAccountEmail(accountEmail);
    }

    @Override
    public void saveEyeDonorInfo(EyeDonorInfoClass eyeDonorInfoClass) {
        iEyeDonorRepository.save(eyeDonorInfoClass);
    }

    @Override
    public void deleteEyeDonors(String eyeOrganizationId) {
        iEyeDonorRepository.deleteAllByEyeOrganizationId(eyeOrganizationId);
    }

    @Override
    public List<EyeOrganizationInfoClass> getAllEyeOrganization() {
        return iEyeOrganizationInfoRepository.findAll();
    }

    @Override
    public List<EyeOrganizationInfoClass> getDivisionEyeOrganizations(String division) {
        return iEyeOrganizationInfoRepository.findByAccountDivision(division);
    }

    @Override
    public List<EyeOrganizationInfoClass> getDistricEyeOrganizations(String distric) {
        return iEyeOrganizationInfoRepository.findByAccountDistric(distric);
    }

    @Override
    public List<EyeOrganizationInfoClass> getUpazilaEyeOrganizations(String upazila) {
        return iEyeOrganizationInfoRepository.findByAccountUpazila(upazila);
    }

    @Override
    public List<OrganizationsInfoClass> findBlood(String donarBloodType) {

        List<OrganizationsInfoClass> organizations = null;
        List<DonorInfoClass> donors = iDonorsInfoRepository.findByDonarBloodType(donarBloodType);
        List<String> orgID=null;
        for(int i=0;i<donors.size();i++){
            orgID.add(donors.get(i).getBloodOrganizationId());
        }
        System.out.println(orgID);
        for (int i=0;i<orgID.size();i++){
            organizations.add(iOrganizationInfoRepository.findByAccountId(orgID.get(i)));
        }
        //        List<String> organizationId = iDonorsInfoRepository.findByDonarBloodType(donarBloodType)
//                .stream()
//                .map(d-> d.getBloodOrganizationId()).collect(Collectors.toList());
//        System.out.println("Organization Id= "+organizationId);
//        organizations.add(organizationId.forEach(s -> iOrganizationInfoRepository.findByAccountId(s)));

        return organizations;
    }
}
