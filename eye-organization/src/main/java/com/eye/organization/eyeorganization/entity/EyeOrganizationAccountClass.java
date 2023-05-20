package com.eye.organization.eyeorganization.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eye_Organization_accountsTB")
public class EyeOrganizationAccountClass {

    @Id
    private String accountId;
    @Column(name = "name")
    private String accountName;
    @Column(name = "number")
    private String accountNumber;
    @Column(name = "email")
    private String accountEmail;
    @Column(name = "division")
    private String accountDivision;
    @Column(name = "distric")
    private String accountDistric;
    @Column(name = "upazila")
    private String accountUpazila;

    public EyeOrganizationAccountClass() {
    }

    public EyeOrganizationAccountClass(String accountId, String accountName, String accountNumber, String accountEmail, String accountDivision, String accountDistric, String accountUpazila) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountEmail = accountEmail;
        this.accountDivision = accountDivision;
        this.accountDistric = accountDistric;
        this.accountUpazila = accountUpazila;
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

}
