package com.blood.organization.bloodorganization.service;

import com.blood.organization.bloodorganization.entity.*;
import java.util.List;

public interface IService {
    public void delete_account(String accountEmail);
    public void update_account(AccountClass accountClass, String accountEmail);
    public String save_donar_info(DonarInfoClass donarInfoClass, String accountEmail);
    public BloodOrganizationClass getAllDonors(String accountEmail);
    public List<DonarInfoClass> four_month_completed_donor(String accountEmail);
    public void send_message_donar(String accountEmail);
    public void delete_donor(String donarId);
    public ProfileClass profile(String accountEmail);
    public void sendBloodRequest(BloodRequestClass bloodRequestClass);
    public List<NotificationClass> notification(String accountEmail);
    public String deliveryrequest(DeliveryRequestClass deliveryRequestClass, String accountEmail);
    public List<DeliveryRequestClass> allDeliveryRequest(String accountEmail);

}
