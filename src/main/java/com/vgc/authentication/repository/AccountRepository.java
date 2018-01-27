package com.vgc.authentication.repository;
//package cn.com.sina.alan.oauth.reposity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vgc.authentication.entity.Account;
/**
 * The AccountRepository interface is a Spring Data JPA data repository for
 * Account entities. The AccountRepository provides all the data access
 * behaviors exposed by <code>JpaRepository</code> and additional custom
 * behaviors may be defined in this interface.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	
    Account findByUsername(String email);

    @Override
    void delete(Account user);
    
}