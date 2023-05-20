package com.admin.service.AdminService.repository;

import com.admin.service.AdminService.entity.DeliveryRequestsClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeliveryRequestRepository extends JpaRepository<DeliveryRequestsClass, Integer> {
}
