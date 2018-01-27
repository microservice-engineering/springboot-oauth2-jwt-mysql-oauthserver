package com.vgc.authentication.repository;
//package cn.com.sina.alan.oauth.reposity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vgc.authentication.entity.Role;

/**
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByCode(String code);

    @Override
    void delete(Role role);

}
