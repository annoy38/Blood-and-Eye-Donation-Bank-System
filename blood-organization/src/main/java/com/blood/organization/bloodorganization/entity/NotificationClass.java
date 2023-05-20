package com.blood.organization.bloodorganization.entity;

public class NotificationClass {
    private String patientName;
    private String patientNumber;
    private String hospitalName;
    private String requestedBloodType;

    public NotificationClass(String patientName, String patientNumber, String hospitalName, String requestedBloodType) {
        this.patientName = patientName;
        this.patientNumber = patientNumber;
        this.hospitalName = hospitalName;
        this.requestedBloodType = requestedBloodType;
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

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getRequestedBloodType() {
        return requestedBloodType;
    }

    public void setRequestedBloodType(String requestedBloodType) {
        this.requestedBloodType = requestedBloodType;
    }
}
