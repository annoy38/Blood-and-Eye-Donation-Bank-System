package com.authserver.service.authserver.config;

import com.authserver.service.authserver.entity.OrganizationAccountClass;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CustomUserDetailsClass implements UserDetails {

    private String orgEmail;
    private String orgPassword;

    public CustomUserDetailsClass(OrganizationAccountClass accountClass) {
        this.orgEmail = accountClass.getOrgEmail();
        this.orgPassword = accountClass.getOrgPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return orgPassword;
    }

    @Override
    public String getUsername() {
        return orgEmail;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
