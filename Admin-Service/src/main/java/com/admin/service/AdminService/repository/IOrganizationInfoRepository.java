package com.admin.service.AdminService.repository;

import com.admin.service.AdminService.entity.OrganizationsInfoClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrganizationInfoRepository extends JpaRepository<OrganizationsInfoClass, String> {
    OrganizationsInfoClass findByAccountId(String organizationId);
    List<OrganizationsInfoClass> findByAccountDivision(String organizationDivision);
    List<OrganizationsInfoClass> findByAccountDistric(String organizationDistric);
    List<OrganizationsInfoClass> findByAccountUpazila(String organizationUpazila);

    void deleteByAccountEmail(String accountEmail);
}
