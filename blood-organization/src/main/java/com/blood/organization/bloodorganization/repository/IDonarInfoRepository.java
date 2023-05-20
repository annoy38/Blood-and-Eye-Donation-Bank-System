package com.blood.organization.bloodorganization.repository;

import com.blood.organization.bloodorganization.entity.DonarInfoClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDonarInfoRepository extends JpaRepository<DonarInfoClass, String> {
    public boolean findByDonarId(String id);

    List<DonarInfoClass> findByBloodOrganizationId(String accountId);

    List<DonarInfoClass> findByStatus(String status);
    void deleteAllByBloodOrganizationId(String accountId);
    void deleteByDonarId(String donarId);
}
