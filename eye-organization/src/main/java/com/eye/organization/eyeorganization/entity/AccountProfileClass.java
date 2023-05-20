package com.eye.organization.eyeorganization.entity;


public class AccountProfileClass {
    private String orgName;
    private String orgNumber;
    private String orgEmail;
    private String orgDivision;
    private String orgDistric;
    private String orgUpazila;

    public AccountProfileClass(String orgName, String orgNumber, String orgEmail, String orgDivision, String orgDistric, String orgUpazila) {
        this.orgName = orgName;
        this.orgNumber = orgNumber;
        this.orgEmail = orgEmail;
        this.orgDivision = orgDivision;
        this.orgDistric = orgDistric;
        this.orgUpazila = orgUpazila;
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
}
