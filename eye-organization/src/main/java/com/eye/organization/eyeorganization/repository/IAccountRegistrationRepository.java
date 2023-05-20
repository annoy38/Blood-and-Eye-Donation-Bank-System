package com.eye.organization.eyeorganization.repository;

import com.eye.organization.eyeorganization.entity.EyeOrganizationAccountClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRegistrationRepository extends JpaRepository<EyeOrganizationAccountClass, String> {
    EyeOrganizationAccountClass findByAccountId(String accountId);

    void deleteByAccountEmail(String accountId);

    EyeOrganizationAccountClass findByAccountEmail(String email);
}
