package com.blood.organization.bloodorganization.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "donor_infoTB")
public class DonarInfoClass {
    @Id
    private String donarId;
    @Column(name = "blood_organization_id")
    private String bloodOrganizationId;
    @Column(name = "name")
    private String donarName;
    @Column(name = "email")
    private String donarEmail;
    @Column(name = "age")
    private int donarAge;
    @Column(name = "gender")
    private String donarGender;
    @Column(name = "address")
    private String donarAddress;
    @Column(name = "blood_type")
    private String donarBloodType;
    @Column(name = "blood_donate_date")
    private LocalDate localDate;
    @Column(name = "blood_donor_status")
    private String status;

    public DonarInfoClass(String donarId, String bloodOrganizationId, String donarName, String donarEmail, int donarAge, String donarGender, String donarAddress, String donarBloodType, LocalDate localDate, String status) {
        this.donarId = donarId;
        this.bloodOrganizationId = bloodOrganizationId;
        this.donarName = donarName;
        this.donarEmail = donarEmail;
        this.donarAge = donarAge;
        this.donarGender = donarGender;
        this.donarAddress = donarAddress;
        this.donarBloodType = donarBloodType;
        this.localDate = localDate;
        this.status = status;
    }

    public DonarInfoClass() {

    }

    public String getDonarId() {
        return donarId;
    }

    public void setDonarId(String donarId) {
        this.donarId = donarId;
    }

    public String getBloodOrganizationId() {
        return bloodOrganizationId;
    }

    public void setBloodOrganizationId(String bloodOrganizationId) {
        this.bloodOrganizationId = bloodOrganizationId;
    }

    public String getDonarName() {
        return donarName;
    }

    public void setDonarName(String donarName) {
        this.donarName = donarName;
    }

    public String getDonarEmail(){
        return donarEmail;
    }

    public void setDonarEmail(String donarEmail){
        this.donarEmail = donarEmail;
    }

    public int getDonarAge() {
        return donarAge;
    }

    public void setDonarAge(int donarAge) {
        this.donarAge = donarAge;
    }

    public String getDonarGender() {
        return donarGender;
    }

    public void setDonarGender(String donarGender) {
        this.donarGender = donarGender;
    }

    public String getDonarAddress() {
        return donarAddress;
    }

    public void setDonarAddress(String donarAddress) {
        this.donarAddress = donarAddress;
    }

    public String getDonarBloodType() {
        return donarBloodType;
    }

    public void setDonarBloodType(String donarBloodType) {
        this.donarBloodType = donarBloodType;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
