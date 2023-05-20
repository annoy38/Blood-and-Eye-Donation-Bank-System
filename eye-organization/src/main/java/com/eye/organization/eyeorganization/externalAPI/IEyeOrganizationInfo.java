package com.eye.organization.eyeorganization.externalAPI;

import com.eye.organization.eyeorganization.entity.DeliveryRequestClass;
import com.eye.organization.eyeorganization.entity.EyeDonarClass;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ADMIN-SERVICE", url = "http://localhost:8085/api/admin")
public interface IEyeOrganizationInfo {

    @PostMapping("/delivery-request")
    public String send_delivery_request(@RequestBody DeliveryRequestClass deliveryRequestClass);

    @PostMapping("/save-eye-donor")
    public String saveEyeDonor(@RequestBody EyeDonarClass eyeDonarClass);

    @DeleteMapping("/delete-eye-organization")
    public void deleteEyeOrganizationAccount(String accountEmail);

    @DeleteMapping("/delete-eye-donors")
    public void deleteEyeDonors(String eyeOrganizationId);
}
