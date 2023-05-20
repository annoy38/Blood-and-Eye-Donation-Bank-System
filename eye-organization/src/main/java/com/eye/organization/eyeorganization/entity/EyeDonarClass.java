package com.eye.organization.eyeorganization.entity;


import javax.persistence.*;

@Entity
@Table(name="eye_donorsTB")
public class EyeDonarClass {
    @Id
    private String donorId;
    @Column(name = "eye_organization_id")
    private String eyeOrganizationId;
    @Column(name = "name")
    private String donorName;
    @Column(name = "email")
    private String donorEmail;
    @Column(name = "age")
    private int donorAge;
    @Column(name = "address")
    private String donorAddress;
    @Column(name = "blood_type")
    private String donorBloodType;
    @Column(name = "gender")
    private String donorGender;

    public EyeDonarClass() {
    }

    public EyeDonarClass(String donorId, String eyeOrganizationId, String donorName, String donorEmail, int donorAge, String donorAddress, String donorBloodType, String donorGender) {
        this.donorId = donorId;
        this.eyeOrganizationId = eyeOrganizationId;
        this.donorName = donorName;
        this.donorEmail = donorEmail;
        this.donorAge = donorAge;
        this.donorAddress = donorAddress;
        this.donorBloodType = donorBloodType;
        this.donorGender = donorGender;
    }

    public String getDonorId() {
        return donorId;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }

    public String getEyeOrganizationId() {
        return eyeOrganizationId;
    }

    public void setEyeOrganizationId(String eyeOrganizationId) {
        this.eyeOrganizationId = eyeOrganizationId;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorEmail() {
        return donorEmail;
    }

    public void setDonorEmail(String donorEmail) {
        this.donorEmail = donorEmail;
    }

    public int getDonorAge() {
        return donorAge;
    }

    public void setDonorAge(int donorAge) {
        this.donorAge = donorAge;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        this.donorAddress = donorAddress;
    }

    public String getDonorBloodType() {
        return donorBloodType;
    }

    public void setDonorBloodType(String donorBloodType) {
        this.donorBloodType = donorBloodType;
    }

    public String getDonorGender() {
        return donorGender;
    }

    public void setDonorGender(String donorGender) {
        this.donorGender = donorGender;
    }
}
