package com.admin.service.AdminService.repository;

import com.admin.service.AdminService.entity.EyeOrganizationInfoClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEyeOrganizationInfoRepository extends JpaRepository<EyeOrganizationInfoClass, String> {
    List<EyeOrganizationInfoClass> findByAccountDivision(String division);

    List<EyeOrganizationInfoClass> findByAccountDistric(String distric);

    List<EyeOrganizationInfoClass> findByAccountUpazila(String upazila);

    void deleteByAccountEmail(String accountEmail);
}
