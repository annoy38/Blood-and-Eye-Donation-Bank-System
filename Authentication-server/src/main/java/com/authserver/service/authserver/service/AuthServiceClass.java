package com.authserver.service.authserver.service;

import com.authserver.service.authserver.entity.OrganizationAccountClass;
import com.authserver.service.authserver.entity.OrganizationClass;
import com.authserver.service.authserver.externalAPI.ISendBloodOrganizationDetails;
import com.authserver.service.authserver.externalAPI.ISendEyeOrganizationDetails;
import com.authserver.service.authserver.externalAPI.ISendOrganizationDetailsToAdmin;
import com.authserver.service.authserver.repository.IOrganizationAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.regex.Pattern;

@Service
public class AuthServiceClass {

    @Autowired
    private IOrganizationAccountRepository iOrganizationAccountRepository;

    @Autowired
    private JwtServiceClass jwtServiceClass;

    @Autowired
    private ISendBloodOrganizationDetails iSendBloodOrganizationDetails;

    @Autowired
    private ISendOrganizationDetailsToAdmin iSendOrganizationDetailsToAdmin;

    @Autowired
    private ISendEyeOrganizationDetails iSendEyeOrganizationDetails;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String bloodRegistration(OrganizationAccountClass accountClass) {
        String randomUUID = UUID.randomUUID().toString();
        accountClass.setOrgAccountId(randomUUID);
        if (isValidEmail(accountClass.getOrgEmail())) {
            if(!isAccountExit(accountClass.getOrgNumber())) {
                String encodedPassword = passwordEncoder.encode(accountClass.getOrgPassword());
                accountClass.setOrgPassword(encodedPassword);
                iOrganizationAccountRepository.save(accountClass);
                OrganizationClass organizationClass = new OrganizationClass(
                        accountClass.getOrgAccountId(),
                        accountClass.getOrgName(),
                        accountClass.getOrgNumber(),
                        accountClass.getOrgEmail(),
                        accountClass.getOrgDivision(),
                        accountClass.getOrgDistric(),
                        accountClass.getOrgUpazila(),
                        accountClass.getOrgType());
                iSendBloodOrganizationDetails.registrationAccount(organizationClass);
                iSendOrganizationDetailsToAdmin.saveOrganization(organizationClass);
                return "Registration successful";
            }
            else {
                return "Account Already Register";
            }
        }
        return "Invalid Email";
    }

    public String eyeRegistration(OrganizationAccountClass accountClass) {
        String randomUUID = UUID.randomUUID().toString();
        accountClass.setOrgAccountId(randomUUID);
        if (isValidEmail(accountClass.getOrgEmail())) {
            if(!isAccountExit(accountClass.getOrgNumber())) {
                String encodedPassword = passwordEncoder.encode(accountClass.getOrgPassword());
                accountClass.setOrgPassword(encodedPassword);
                iOrganizationAccountRepository.save(accountClass);
                OrganizationClass organizationClass = new OrganizationClass(
                        accountClass.getOrgAccountId(),
                        accountClass.getOrgName(),
                        accountClass.getOrgNumber(),
                        accountClass.getOrgEmail(),
                        accountClass.getOrgDivision(),
                        accountClass.getOrgDistric(),
                        accountClass.getOrgUpazila(),
                        accountClass.getOrgType()
                );
                iSendEyeOrganizationDetails.registration(organizationClass);
                iSendOrganizationDetailsToAdmin.saveEyeOrganizationInfo(organizationClass);
                return "Registration successful";
            }
            else {
                return "Account Already Register";
            }
        }
        return "Invalid Email";
    }

    private boolean isAccountExit(String number){
        if(iOrganizationAccountRepository.findByOrgNumber(number)==null){
            return false;
        }
        return true;
    }

    private boolean isValidEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public String generateToken(String orgEmail) {
        return jwtServiceClass.generateToken(orgEmail);
    }

    public void validateToken(String token) {
        jwtServiceClass.validateToken(token);
    }

    public void deleteOrgAccount(String accountEmail){
        iOrganizationAccountRepository.deleteByOrgEmail(accountEmail);
    }

}
