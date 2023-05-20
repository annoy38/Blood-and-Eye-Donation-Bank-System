package com.admin.service.AdminService.repository;

import com.admin.service.AdminService.entity.EyeDonorInfoClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEyeDonorRepository extends JpaRepository<EyeDonorInfoClass, String> {

    void deleteAllByEyeOrganizationId(String eyeOrganizationId);
}
