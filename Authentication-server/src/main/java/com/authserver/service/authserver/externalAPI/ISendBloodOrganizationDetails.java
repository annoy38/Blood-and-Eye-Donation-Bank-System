package com.authserver.service.authserver.externalAPI;

import com.authserver.service.authserver.entity.OrganizationClass;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "BLOOD-ORGANIZATION-SERVICE", url = "http://localhost:8081/organization/bloodorganization")
public interface ISendBloodOrganizationDetails {

    @PostMapping("/blood-registration")
    public void registrationAccount(@RequestBody OrganizationClass organizationClass);
}
