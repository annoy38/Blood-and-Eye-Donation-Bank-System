package com.eye.organization.eyeorganization.repository;

import com.eye.organization.eyeorganization.entity.EyeNotificationClass;
import com.eye.organization.eyeorganization.entity.EyeRequestClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEyeRequestRepository extends JpaRepository<EyeRequestClass, Integer> {
    List<EyeRequestClass> findAllByEyeOrganizationId(String eyeOrganizationId);
}
