package com.eye.organization.eyeorganization.service;

import com.eye.organization.eyeorganization.entity.*;
import java.util.List;

public interface IEyeService {

    public void RegistrationAccount(EyeOrganizationAccountClass accountClass);
    public AccountProfileClass AccountProfile(String accountEmail);
    public void deleteAccount(String accountId);
    public void updateAccount(EyeOrganizationAccountClass accountClass, String accountEmail);
    public void saveDonorInfo(EyeDonarClass eyeDonarClass, String accountEmail);

    public EyeOrganizationDonorDetailsClass getAllDonors(String accountEmail);
    public void deleteAllDonor();
    public void sendDeliveryRequest(DeliveryRequestClass deliveryRequestClass, String accountEmail);
    public List<DeliveryRequestClass> allRequest(String accountEmail);

    public void sendEyeRequest(EyeRequestClass eyeRequestClass);

    public List<EyeNotificationClass> SeeNotification(String accountEmail);






//    Eye Bank Organization service:
//1. Registration
//2. Login
//3. Profile
//4. See notification
//5. Delete account
//6. Update account
//7. Input donar info
//8. Delivery request
//9. Logout
}
