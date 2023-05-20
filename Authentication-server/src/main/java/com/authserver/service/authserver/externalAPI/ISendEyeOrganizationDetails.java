package com.authserver.service.authserver.externalAPI;

import com.authserver.service.authserver.entity.OrganizationClass;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "EYE-ORGANIZATION-SERVICE", url = "http://localhost:8082/organization/eyeorganization")
public interface ISendEyeOrganizationDetails {

    @PostMapping("/eye-registration")
    public void registration(@RequestBody OrganizationClass organizationClass);
}
