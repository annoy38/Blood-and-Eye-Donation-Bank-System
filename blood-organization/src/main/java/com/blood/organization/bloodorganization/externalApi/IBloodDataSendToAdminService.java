package com.blood.organization.bloodorganization.externalApi;

import com.blood.organization.bloodorganization.entity.DeliveryRequestClass;
import com.blood.organization.bloodorganization.entity.DonarInfoClass;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ADMIN-SERVICE", url = "http://localhost:8085/api/admin")
public interface IBloodDataSendToAdminService {
//
//    @PostMapping("/saveorganizationinfo")
//    public String saveAccountInfo(@RequestBody OrganizationInfoClass organizationInfoClass);

    @PostMapping("/delivery-request")
    public String send_delivery_request(@RequestBody DeliveryRequestClass deliveryRequestClass);

    @PostMapping("/save-donors")
    public String saveDonors(@RequestBody DonarInfoClass donarInfoClass);

    @DeleteMapping("/delete-blood-organization")
    public void deleteBloodOrganization(String accountEmail);

    @DeleteMapping("/delete-blood-donors")
    public void deleteAllBloodDonors(String accountId);
}
