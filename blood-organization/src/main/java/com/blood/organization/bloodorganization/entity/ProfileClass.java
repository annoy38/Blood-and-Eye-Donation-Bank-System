package com.blood.organization.bloodorganization.entity;

public class ProfileClass {
    private String userName;
    private String userNumber;
    private String userEmail;
    private String userDivision;
    private String userDistric;
    private String userUpazila;

    public ProfileClass(String userName, String userNumber, String userEmail, String userDivision, String userDistric, String userUpazila) {
        this.userName = userName;
        this.userNumber = userNumber;
        this.userEmail = userEmail;
        this.userDivision = userDivision;
        this.userDistric = userDistric;
        this.userUpazila = userUpazila;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserDivision() {
        return userDivision;
    }

    public void setUserDivision(String userDivision) {
        this.userDivision = userDivision;
    }

    public String getUserDistric() {
        return userDistric;
    }

    public void setUserDistric(String userDistric) {
        this.userDistric = userDistric;
    }

    public String getUserUpazila() {
        return userUpazila;
    }

    public void setUserUpazila(String userUpazila) {
        this.userUpazila = userUpazila;
    }
}
