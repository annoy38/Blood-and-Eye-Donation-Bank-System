package com.admin.service.AdminService.service;

import com.admin.service.AdminService.entity.*;

import java.util.List;

public interface IService {

    public List<BloodOrganizationClass> allOrganization();

    public void getRequest(DeliveryRequestsClass deliveryRequestsClass);

    public List<DeliveryRequestsClass> getAllRequest();

    public void saveOrganizationInfo(OrganizationsInfoClass organizationsInfoClass);
    public void deleteBloodOrg(String accountEmail);
    public void saveDonorsInfo(DonorInfoClass donorInfoClass);
    public void deleteAllDonors(String bloodOrganizationId);
    public List<OrganizationsInfoClass> getAllOrganization();
    public List<OrganizationsInfoClass> getDivisionOrganizations(String division);
    public List<OrganizationsInfoClass> getDistricOrganizations(String distric);
    public List<OrganizationsInfoClass> getUpazilaOrganizations(String upazila);
    public List<OrganizationsInfoClass> findBlood(String donarBloodType);
    public long totalNumberOfBloodOrganizations();
    public long totalNumberOfBloodDonors();


    public void saveEyeOrganizationInfo(EyeOrganizationInfoClass organizationInfoClass);
    public void deleteEyeOrganization(String accountEmail);
    public void saveEyeDonorInfo(EyeDonorInfoClass eyeDonorInfoClass);
    public void deleteEyeDonors(String eyeOrganizationId);

    public List<EyeOrganizationInfoClass> getAllEyeOrganization();
    public List<EyeOrganizationInfoClass> getDivisionEyeOrganizations(String division);
    public List<EyeOrganizationInfoClass> getDistricEyeOrganizations(String distric);
    public List<EyeOrganizationInfoClass> getUpazilaEyeOrganizations(String upazila);



//    Admin Service:
//   1. Show total number of blood organization register in system and their details
//   2. Show total number of eye orgganization register in system and their details
//   3. Blood organization data analysis
//   4. Eye organization data analysis
//   5. See delivery request

}
