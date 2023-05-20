package com.eye.organization.eyeorganization.entity;

import javax.persistence.*;

@Entity
@Table(name = "eye_request")
public class EyeRequestClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eyeRequestId;
    @Column(name = "eye_organization_email")
    private String eyeOrganizationEmail;
    @Column(name = "patient_name")
    private String patientName;
    @Column(name = "patient_number")
    private String patientNumber;
    @Column(name = "patient_address")
    private String patientAddress;
    @Column(name = "patient_gender")
    private String patientGender;
    @Column(name = "patient_age")
    private int patientAge;
    @Column(name = "patient_blood_type")
    private String patientBloodType;

    public EyeRequestClass() {
    }

    public EyeRequestClass(int eyeRequestId, String eyeOrganizationEmail, String patientName, String patientNumber, String patientAddress, String patientGender, int patientAge, String patientBloodType) {
        this.eyeRequestId = eyeRequestId;
        this.eyeOrganizationEmail = eyeOrganizationEmail;
        this.patientName = patientName;
        this.patientNumber = patientNumber;
        this.patientAddress = patientAddress;
        this.patientGender = patientGender;
        this.patientAge = patientAge;
        this.patientBloodType = patientBloodType;
    }

    public int getEyeRequestId() {
        return eyeRequestId;
    }

    public void setEyeRequestId(int eyeRequestId) {
        this.eyeRequestId = eyeRequestId;
    }

    public String getEyeOrganizationEmail() {
        return eyeOrganizationEmail;
    }

    public void setEyeOrganizationEmail(String eyeOrganizationEmail) {
        this.eyeOrganizationEmail = eyeOrganizationEmail;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientBloodType() {
        return patientBloodType;
    }

    public void setPatientBloodType(String patientBloodType) {
        this.patientBloodType = patientBloodType;
    }
}
