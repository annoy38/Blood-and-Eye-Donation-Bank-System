package com.eye.organization.eyeorganization.controller;

import com.eye.organization.eyeorganization.entity.*;
import com.eye.organization.eyeorganization.service.EyeServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/organization/eyeorganization")
public class EyeOrganizationControllerClass {

    @Autowired
    private EyeServiceClass eyeServiceClass;

    @GetMapping("/message")
    public String message(){
        return "Eye Organization Service Working";
    }

    @PostMapping("/eye-registration")
    public void registration(@RequestBody EyeOrganizationAccountClass accountClass){
         eyeServiceClass.RegistrationAccount(accountClass);
    }

    @GetMapping("/profile")
    public AccountProfileClass profile(@RequestHeader("loggedInUser") String accountEmail){
        return eyeServiceClass.AccountProfile(accountEmail);
    }

    @GetMapping("/delete-eye-account}")
    public ResponseEntity<String> deleteAccount(@RequestHeader("loggedInUser") String accountEmail){
        eyeServiceClass.deleteAccount(accountEmail);
        return new ResponseEntity<>("Account deleted", HttpStatus.OK);
    }

    @PutMapping("/update-account")
    public ResponseEntity<String> updateAccount(@RequestBody EyeOrganizationAccountClass accountClass, @RequestHeader("loggedInUser") String accountEmail){
        eyeServiceClass.updateAccount(accountClass, accountEmail);
        return new ResponseEntity<>("Profile Update", HttpStatus.OK);
    }

    @PostMapping("/save-donor-info")
    public ResponseEntity<String> saveDonorsInfo(@RequestBody EyeDonarClass eyeDonarClass, @RequestHeader("loggedInUser") String accountEmail){
        eyeServiceClass.saveDonorInfo(eyeDonarClass, accountEmail);
        return new ResponseEntity<>("Save donor Data", HttpStatus.CREATED);
    }

    @GetMapping("/get-all-eye-donors")
    public EyeOrganizationDonorDetailsClass getAllEyeDonors(@RequestHeader("loggedInUser") String accountEmail){
        return eyeServiceClass.getAllDonors(accountEmail);
    }


    @GetMapping("/deletealldonors")
    public String deleteAllDonors(){
        eyeServiceClass.deleteAllDonor();
        return "Deleted all donors Data";
    }

    @PostMapping("/delivery-request")
    public ResponseEntity<String> sendDeliveryRequest(@RequestBody DeliveryRequestClass deliveryRequestClass, @RequestHeader("loggedInUser") String accountEmail){
        eyeServiceClass.sendDeliveryRequest(deliveryRequestClass, accountEmail);
        return new ResponseEntity<>("Delivery Request Send", HttpStatus.OK);
    }

    @GetMapping("/all-delivery-request")
    public List<DeliveryRequestClass> allDeliveryRequest(@RequestHeader("loggedInUser") String accountEmail){
        return eyeServiceClass.allRequest(accountEmail);
    }

    @PostMapping("/send-eye-request")
    public String sendEyeRequest(@RequestBody EyeRequestClass eyeRequestClass){
        eyeServiceClass.sendEyeRequest(eyeRequestClass);
        return "Request Sended";
    }

    @GetMapping("/eye-requests")
    public List<EyeNotificationClass> eyeNotification(@RequestHeader("loggedInUser") String accountEmail){
        return eyeServiceClass.SeeNotification(accountEmail);
    }
}
