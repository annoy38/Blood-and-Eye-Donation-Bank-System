package com.admin.service.AdminService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eye_organization_info")
public class EyeOrganizationInfoClass {
    @Id
    private String accountId;
    @Column(name = "eye_organization_name")
    private String accountName;
    @Column(name = "eye_organization_number")
    private String accountNumber;
    @Column(name = "eye_organization_email")
    private String accountEmail;
    @Column(name = "eye_organization_division")
    private String accountDivision;
    @Column(name = "eye_organization_distric")
    private String accountDistric;
    @Column(name = "eye_organization_upazila")
    private String accountUpazila;

    private String orgType;

    public EyeOrganizationInfoClass() {
    }

    public EyeOrganizationInfoClass(String accountId, String accountName, String accountNumber, String accountEmail, String accountDivision, String accountDistric, String accountUpazila, String orgType) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountEmail = accountEmail;
        this.accountDivision = accountDivision;
        this.accountDistric = accountDistric;
        this.accountUpazila = accountUpazila;
        this.orgType = orgType;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public String getAccountDivision() {
        return accountDivision;
    }

    public void setAccountDivision(String accountDivision) {
        this.accountDivision = accountDivision;
    }

    public String getAccountDistric() {
        return accountDistric;
    }

    public void setAccountDistric(String accountDistric) {
        this.accountDistric = accountDistric;
    }

    public String getAccountUpazila() {
        return accountUpazila;
    }

    public void setAccountUpazila(String accountUpazila) {
        this.accountUpazila = accountUpazila;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }
}
