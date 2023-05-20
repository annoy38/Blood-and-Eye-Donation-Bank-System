package com.admin.service.AdminService.repository;

import com.admin.service.AdminService.entity.DonorInfoClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDonorsInfoRepository extends JpaRepository<DonorInfoClass, String> {
    List<DonorInfoClass> findByDonarBloodType(String donarBloodType);
    void deleteAllByBloodOrganizationId(String bloodOrganizationId);
}
