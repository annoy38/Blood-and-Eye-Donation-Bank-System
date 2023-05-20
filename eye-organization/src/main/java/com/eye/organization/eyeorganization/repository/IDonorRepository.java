package com.eye.organization.eyeorganization.repository;

import com.eye.organization.eyeorganization.entity.EyeDonarClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDonorRepository extends JpaRepository<EyeDonarClass, String> {
    List<EyeDonarClass> findByEyeOrganizationId(String eyeOrganizationId);
    void deleteAllByEyeOrganizationId(String eyeOrganizationId);
}
