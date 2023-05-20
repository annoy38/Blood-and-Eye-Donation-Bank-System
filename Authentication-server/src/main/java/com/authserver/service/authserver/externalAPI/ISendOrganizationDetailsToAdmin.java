package com.authserver.service.authserver.externalAPI;

import com.authserver.service.authserver.entity.OrganizationClass;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ADMIN-SERVICE", url = "http://localhost:8085/api/admin")
public interface ISendOrganizationDetailsToAdmin {

    @PostMapping("/blood-registration")
    public void saveOrganization(@RequestBody OrganizationClass organizationClass);

    @PostMapping("/eye-registration")
    public void saveEyeOrganizationInfo(@RequestBody OrganizationClass organizationClass);
}
