package com.eye.organization.eyeorganization.externalAPI;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;

@FeignClient(name = "AUTHENTICATION-SERVER", url = "http://localhost:8084/auth/organization")
public interface IAccountDeleteAndUpdate {

    @DeleteMapping("/delete-account")
    public void deleteAccount(String accountEmail);
}
