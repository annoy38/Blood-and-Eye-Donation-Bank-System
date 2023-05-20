package com.blood.organization.bloodorganization.repository;

import com.blood.organization.bloodorganization.entity.AccountClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends JpaRepository<AccountClass, String> {
    public boolean findByAccountNumber(String number);
    public AccountClass findByAccountId(String id);
    void deleteByAccountEmail(String accountEmail);
    AccountClass findByAccountEmail(String email);
}
