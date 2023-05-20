package com.blood.organization.bloodorganization.entity;

import java.util.Collection;

public class BloodOrganizationClass {
    private String bloodOrganizationName;
    private String bloodOrganizationNumber;
    private String bloodOrganizationEmail;
    private String bloodOrganizationDivision;
    private String bloodOrganizationDistric;
    private String bloodOrganizationUpozila;
    private Collection<DonarInfoClass> donarInfoClasses;

    public BloodOrganizationClass() {
    }

    public BloodOrganizationClass(String bloodOrganizationName, String bloodOrganizationNumber,
                                  String bloodOrganizationEmail, String bloodOrganizationDivision,
                                  String bloodOrganizationDistric, String bloodOrganizationUpozila,
                                  Collection<DonarInfoClass> donarInfoClasses) {
        this.bloodOrganizationName = bloodOrganizationName;
        this.bloodOrganizationNumber = bloodOrganizationNumber;
        this.bloodOrganizationEmail = bloodOrganizationEmail;
        this.bloodOrganizationDivision = bloodOrganizationDivision;
        this.bloodOrganizationDistric = bloodOrganizationDistric;
        this.bloodOrganizationUpozila = bloodOrganizationUpozila;
        this.donarInfoClasses = donarInfoClasses;
    }

//    public <R> BloodOrganizationClass(String accountName, String accountNumber, String accountEmail, String accountDivision, String accountDistric, String accountUpozila, R collect) {
//    }

    public String getBloodOrganizationName() {
        return bloodOrganizationName;
    }

    public void setBloodOrganizationName(String bloodOrganizationName) {
        this.bloodOrganizationName = bloodOrganizationName;
    }

    public String getBloodOrganizationNumber() {
        return bloodOrganizationNumber;
    }

    public void setBloodOrganizationNumber(String bloodOrganizationNumber) {
        this.bloodOrganizationNumber = bloodOrganizationNumber;
    }

    public String getBloodOrganizationEmail() {
        return bloodOrganizationEmail;
    }

    public void setBloodOrganizationEmail(String bloodOrganizationEmail) {
        this.bloodOrganizationEmail = bloodOrganizationEmail;
    }

    public String getBloodOrganizationDivision() {
        return bloodOrganizationDivision;
    }

    public void setBloodOrganizationDivision(String bloodOrganizationDivision) {
        this.bloodOrganizationDivision = bloodOrganizationDivision;
    }

    public String getBloodOrganizationDistric() {
        return bloodOrganizationDistric;
    }

    public void setBloodOrganizationDistric(String bloodOrganizationDistric) {
        this.bloodOrganizationDistric = bloodOrganizationDistric;
    }

    public String getBloodOrganizationUpozila() {
        return bloodOrganizationUpozila;
    }

    public void setBloodOrganizationUpozila(String bloodOrganizationUpozila) {
        this.bloodOrganizationUpozila = bloodOrganizationUpozila;
    }

    public Collection<DonarInfoClass> getDonarInfoClasses() {
        return donarInfoClasses;
    }

    public void setDonarInfoClasses(Collection<DonarInfoClass> donarInfoClasses) {
        this.donarInfoClasses = donarInfoClasses;
    }
}
