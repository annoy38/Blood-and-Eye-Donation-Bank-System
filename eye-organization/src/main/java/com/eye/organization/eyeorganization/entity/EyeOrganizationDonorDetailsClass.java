package com.eye.organization.eyeorganization.entity;

import java.util.Collection;

public class EyeOrganizationDonorDetailsClass {
    private String eyeOrganizationName;
    private String eyeOrganizationNumber;
    private String eyeOrganizationEmail;
    private String eyeOrganizationDivision;
    private String eyeOrganizationDistric;
    private String eyeOrganizationUpazila;
    Collection<EyeDonarClass> eyeDonarClasses;

    public EyeOrganizationDonorDetailsClass() {
    }

    public EyeOrganizationDonorDetailsClass(String eyeOrganizationName, String eyeOrganizationNumber, String eyeOrganizationEmail, String eyeOrganizationDivision, String eyeOrganizationDistric, String eyeOrganizationUpazila, Collection<EyeDonarClass> eyeDonarClasses) {
        this.eyeOrganizationName = eyeOrganizationName;
        this.eyeOrganizationNumber = eyeOrganizationNumber;
        this.eyeOrganizationEmail = eyeOrganizationEmail;
        this.eyeOrganizationDivision = eyeOrganizationDivision;
        this.eyeOrganizationDistric = eyeOrganizationDistric;
        this.eyeOrganizationUpazila = eyeOrganizationUpazila;
        this.eyeDonarClasses = eyeDonarClasses;
    }

    public String getEyeOrganizationName() {
        return eyeOrganizationName;
    }

    public void setEyeOrganizationName(String eyeOrganizationName) {
        this.eyeOrganizationName = eyeOrganizationName;
    }

    public String getEyeOrganizationNumber() {
        return eyeOrganizationNumber;
    }

    public void setEyeOrganizationNumber(String eyeOrganizationNumber) {
        this.eyeOrganizationNumber = eyeOrganizationNumber;
    }

    public String getEyeOrganizationEmail() {
        return eyeOrganizationEmail;
    }

    public void setEyeOrganizationEmail(String eyeOrganizationEmail) {
        this.eyeOrganizationEmail = eyeOrganizationEmail;
    }

    public String getEyeOrganizationDivision() {
        return eyeOrganizationDivision;
    }

    public void setEyeOrganizationDivision(String eyeOrganizationDivision) {
        this.eyeOrganizationDivision = eyeOrganizationDivision;
    }

    public String getEyeOrganizationDistric() {
        return eyeOrganizationDistric;
    }

    public void setEyeOrganizationDistric(String eyeOrganizationDistric) {
        this.eyeOrganizationDistric = eyeOrganizationDistric;
    }

    public String getEyeOrganizationUpazila() {
        return eyeOrganizationUpazila;
    }

    public void setEyeOrganizationUpazila(String eyeOrganizationUpazila) {
        this.eyeOrganizationUpazila = eyeOrganizationUpazila;
    }

    public Collection<EyeDonarClass> getEyeDonarClasses() {
        return eyeDonarClasses;
    }

    public void setEyeDonarClasses(Collection<EyeDonarClass> eyeDonarClasses) {
        this.eyeDonarClasses = eyeDonarClasses;
    }
}
