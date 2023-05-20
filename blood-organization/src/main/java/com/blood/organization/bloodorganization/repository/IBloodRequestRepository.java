package com.blood.organization.bloodorganization.repository;

import com.blood.organization.bloodorganization.entity.BloodRequestClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBloodRequestRepository extends JpaRepository<BloodRequestClass, Integer> {
    List<BloodRequestClass> findByBloodOrganizationEmail(String accountId);

}
