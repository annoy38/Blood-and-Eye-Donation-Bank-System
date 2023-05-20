package com.authserver.service.authserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organization_accounts")
public class OrganizationAccountClass {
    @Id
    private String orgAccountId;
    @Column(name = "organization_name")
    private String orgName;
    @Column(name = "organization_number")
    private String orgNumber;
    @Column(name = "organization_email")
    private String orgEmail;
    @Column(name = "organization_division")
    private String orgDivision;
    @Column(name = "organization_distric")
    private String orgDistric;
    @Column(name = "organization_upazila")
    private String orgUpazila;

    @Column(name = "organization_type")
    private String orgType;
    @Column(name = "organization_password")
    private String orgPassword;



    public OrganizationAccountClass() {
    }

    public OrganizationAccountClass(String orgAccountId, String orgName, String orgNumber, String orgEmail, String orgDivision, String orgDistric, String orgUpazila,String orgType,  String orgPassword) {
        this.orgAccountId = orgAccountId;
        this.orgName = orgName;
        this.orgNumber = orgNumber;
        this.orgEmail = orgEmail;
        this.orgDivision = orgDivision;
        this.orgDistric = orgDistric;
        this.orgUpazila = orgUpazila;
        this.orgType = orgType;
        this.orgPassword = orgPassword;
    }

    public String getOrgAccountId() {
        return orgAccountId;
    }

    public void setOrgAccountId(String orgAccountId) {
        this.orgAccountId = orgAccountId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgNumber() {
        return orgNumber;
    }
    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public String getOrgDivision() {
        return orgDivision;
    }

    public void setOrgDivision(String orgDivision) {
        this.orgDivision = orgDivision;
    }

    public String getOrgDistric() {
        return orgDistric;
    }

    public void setOrgDistric(String orgDistric) {
        this.orgDistric = orgDistric;
    }

    public String getOrgUpazila() {
        return orgUpazila;
    }

    public void setOrgUpazila(String orgUpazila) {
        this.orgUpazila = orgUpazila;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getOrgPassword() {
        return orgPassword;
    }

    public void setOrgPassword(String orgPassword) {
        this.orgPassword = orgPassword;
    }
}
