package com.blood.organization.bloodorganization.repository;

import com.blood.organization.bloodorganization.entity.DeliveryRequestClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDeliveryRequestRepository extends JpaRepository<DeliveryRequestClass, String> {
    List<DeliveryRequestClass> findByOrganizationId(String organizationId);
}
