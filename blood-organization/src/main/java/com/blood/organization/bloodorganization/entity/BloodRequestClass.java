package com.blood.organization.bloodorganization.entity;

import javax.persistence.*;

@Entity
@Table(name = "blood_requests")
public class BloodRequestClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int requestId;

    private String bloodOrganizationEmail;
    @Column(name = "patient_name")
    private String patientName;
    @Column(name = "patient_number")
    private String patientNumber;
    @Column(name = "patient_address")
    private String patientAddress;
    @Column(name = "requested_blood_type")
    private String requestBloodType;

    public BloodRequestClass() {
    }

    public BloodRequestClass(int requestId, String bloodOrganizationEmail, String patientName, String patientNumber, String patientAddress, String requestBloodType) {
        this.requestId = requestId;
        this.bloodOrganizationEmail = bloodOrganizationEmail;
        this.patientName = patientName;
        this.patientNumber = patientNumber;
        this.patientAddress = patientAddress;
        this.requestBloodType = requestBloodType;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getBloodOrganizationEmail() {
        return bloodOrganizationEmail;
    }

    public void setBloodOrganizationEmail(String bloodOrganizationEmail) {
        this.bloodOrganizationEmail = bloodOrganizationEmail;
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

    public String getRequestBloodType() {
        return requestBloodType;
    }

    public void setRequestBloodType(String requestBloodType) {
        this.requestBloodType = requestBloodType;
    }
}
