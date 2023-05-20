package com.authserver.service.authserver.dto;

public class LoginRequestClass {
    private String orgEmail;
    private String orgPassword;

    public LoginRequestClass() {
    }

    public LoginRequestClass(String orgEmail, String orgPassword) {
        this.orgEmail = orgEmail;
        this.orgPassword = orgPassword;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public String getOrgPassword() {
        return orgPassword;
    }

    public void setOrgPassword(String orgPassword) {
        this.orgPassword = orgPassword;
    }
}
