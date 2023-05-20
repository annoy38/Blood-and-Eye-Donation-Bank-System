package com.authserver.service.authserver.config;

import com.authserver.service.authserver.entity.OrganizationAccountClass;
import com.authserver.service.authserver.repository.IOrganizationAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomUserDetailsServiceClass implements UserDetailsService {

    @Autowired
    private IOrganizationAccountRepository iOrganizationAccountRepository;

    @Override
    public UserDetails loadUserByUsername(String orgEmail) throws UsernameNotFoundException {
        Optional<OrganizationAccountClass> accountClass = iOrganizationAccountRepository.findByOrgEmail(orgEmail);
        return accountClass.map(CustomUserDetailsClass::new).orElseThrow(() -> new UsernameNotFoundException("user not found with email :" + orgEmail));
    }
}
