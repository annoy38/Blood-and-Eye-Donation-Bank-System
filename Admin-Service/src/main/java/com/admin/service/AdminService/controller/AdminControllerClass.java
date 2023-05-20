package com.admin.service.AdminService.controller;

import com.admin.service.AdminService.entity.*;
import com.admin.service.AdminService.service.ImpServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminControllerClass {

    @Autowired
    private ImpServiceClass impServiceClass;

    @GetMapping("/message")
    public String messageApi(){
        return "Admin Api Working";
    }

    @PostMapping("/delivery-request")
    public String send_delivery_request(@RequestBody DeliveryRequestsClass deliveryRequestsClass){
        impServiceClass.getRequest(deliveryRequestsClass);
        return "Delivery Request send to admin";
    }

    @GetMapping("/get-all-delivery-request")
    public List<DeliveryRequestsClass> getAll(){
        return impServiceClass.getAllRequest();
    }

    @PostMapping("/blood-registration")
    public void saveOrganization(@RequestBody OrganizationsInfoClass organizationsInfoClass){
        impServiceClass.saveOrganizationInfo(organizationsInfoClass);
    }

    @DeleteMapping("/delete-blood-organization")
    public void deleteBloodOrganization(String accountEmail){
        impServiceClass.deleteBloodOrg(accountEmail);
    }


    @PostMapping("/save-donors")
    public String saveDonors(@RequestBody DonorInfoClass donorInfoClass){
        impServiceClass.saveDonorsInfo(donorInfoClass);
        return "Donor Info save";
    }

    @DeleteMapping("/delete-blood-donors")
    public void deleteAllBloodDonors(String accountId){
        impServiceClass.deleteAllDonors(accountId);
    }

    @PostMapping("/eye-registration")
    public void saveEyeOrganizationInfo(@RequestBody EyeOrganizationInfoClass eyeOrganizationInfoClass){
        impServiceClass.saveEyeOrganizationInfo(eyeOrganizationInfoClass);
    }

    @DeleteMapping("/delete-eye-organization")
    public void deleteEyeOrganizationAccount(String accountEmail){
        impServiceClass.deleteEyeOrganization(accountEmail);
    }

    @PostMapping("/save-eye-donor")
    public String saveEyeDonorInfo(@RequestBody EyeDonorInfoClass eyeDonorInfoClass){
        impServiceClass.saveEyeDonorInfo(eyeDonorInfoClass);
        return "Eye donor info save";
    }

    @DeleteMapping("delete-eye-donors")
    public void deleteEyeDonors(String eyeOrganizationId){
        impServiceClass.deleteEyeDonors(eyeOrganizationId);
    }

    @GetMapping("/all-blood-organization")
    public List<OrganizationsInfoClass> getAllBloodOrganization(){
        return impServiceClass.getAllOrganization();
    }

    @GetMapping("/all-blood-organization-in-division/{division}")
    public List<OrganizationsInfoClass> getAllBloodOrganization_in_division(@PathVariable("division") String division){
        return impServiceClass.getDivisionOrganizations(division);
    }

    @GetMapping("/all-blood-organization-in-distric/{distric}")
    public List<OrganizationsInfoClass> getAllBloodOrganization_in_distric(@PathVariable("distric") String distric){
        return impServiceClass.getDistricOrganizations(distric);
    }

    @GetMapping("/all-blood-organization-in-upazila/{upazila}")
    public List<OrganizationsInfoClass> getAllBloodOrganization_in_upazila(@PathVariable("upazila") String upazila){
        return impServiceClass.getUpazilaOrganizations(upazila);
    }

    @GetMapping("/all-blood-organization-in-bloodtype/{bloodtype}")
    public List<OrganizationsInfoClass> getAllBloodOrganization_by_bloodType(@PathVariable("bloodtype") String bloodtype){
        return impServiceClass.findBlood(bloodtype);
    }

    @GetMapping("/total-number-of-blood-organization")
    public long numberOfBloodOrganization(){
        return impServiceClass.totalNumberOfBloodOrganizations();
    }

    @GetMapping("/total-number-of-blood-donors")
    public long numberOfBloodDonors(){
        return impServiceClass.totalNumberOfBloodDonors();
    }

    @GetMapping("/all-eye-organization-in-division/{eyeOrganizationDivision}")
    public List<EyeOrganizationInfoClass> getAllEyeOrganization_in_division(@PathVariable("eyeOrganizationDivision") String eyeOrganizationDivision){
        return impServiceClass.getDivisionEyeOrganizations(eyeOrganizationDivision);
    }

    @GetMapping("/all-eye-organization-in-distric/{eyeOrganizationDistric}")
    public List<EyeOrganizationInfoClass> getAllEyeOrganization_in_distric(@PathVariable("eyeOrganizationDistric") String eyeOrganizationDistric){
        return impServiceClass.getDistricEyeOrganizations(eyeOrganizationDistric);
    }

    @GetMapping("/all-eye-organization-in-upazila/{eyeOrganizationUpazila}")
    public List<EyeOrganizationInfoClass> getAllEyeOrganization_in_upazila(@PathVariable("eyeOrganizationUpazila") String eyeOrganizationUpazila){
        return impServiceClass.getUpazilaEyeOrganizations(eyeOrganizationUpazila);
    }

    @GetMapping("/all-eye-organization")
    public List<EyeOrganizationInfoClass> getAllEyeOrganization(){
        return impServiceClass.getAllEyeOrganization();
    }
}
