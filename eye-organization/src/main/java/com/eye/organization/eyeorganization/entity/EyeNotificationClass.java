package com.eye.organization.eyeorganization.entity;

public class EyeNotificationClass {
    private String patientName;
    private String patientNumber;
    private String patientAddress;
    private String patientGender;
    private int patientAge;
    private String patientBloodType;

    public EyeNotificationClass() {
    }

    public EyeNotificationClass(String patientName, String patientNumber, String patientAddress, String patientGender, int patientAge, String patientBloodType) {
        this.patientName = patientName;
        this.patientNumber = patientNumber;
        this.patientAddress = patientAddress;
        this.patientGender = patientGender;
        this.patientAge = patientAge;
        this.patientBloodType = patientBloodType;
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
