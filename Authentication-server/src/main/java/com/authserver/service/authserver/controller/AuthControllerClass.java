package com.authserver.service.authserver.controller;

import com.authserver.service.authserver.dto.LoginRequestClass;
import com.authserver.service.authserver.entity.OrganizationAccountClass;
import com.authserver.service.authserver.service.AuthServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth/organization")
public class AuthControllerClass {

    @Autowired
    private AuthServiceClass authServiceClass;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/blood-registration")
    public String BloodRegistration(@RequestBody OrganizationAccountClass accountClass){
        return authServiceClass.bloodRegistration(accountClass);
    }

    @PostMapping("/eye-registration")
    public String EyeRegistration(@RequestBody OrganizationAccountClass accountClass){
        return authServiceClass.eyeRegistration(accountClass);
    }

    @PostMapping("/token")
    public String getToken(@RequestBody LoginRequestClass loginRequestClass){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginRequestClass.getOrgEmail(), loginRequestClass.getOrgPassword()
        ));

        if(authentication.isAuthenticated()){
            return authServiceClass.generateToken(loginRequestClass.getOrgEmail());
        }
        else {
            throw new RuntimeException("Invalid access");
        }
    }

    @GetMapping("/validate")
    public String validToken(@RequestParam("token") String token){
        authServiceClass.validateToken(token);
        return "Token is Valid";
    }

    @DeleteMapping("/delete-account")
    public void deleteAccount(String accountEmail){
        authServiceClass.deleteOrgAccount(accountEmail);
    }

}
