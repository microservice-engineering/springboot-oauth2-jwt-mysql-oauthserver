package com.vgc.authentication.repository;
//package cn.com.sina.alan.oauth.reposity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vgc.authentication.entity.Group;

/**
 * Gives to JPA the ability to communicate with database
 */
@Repository
public interface GroupRepository extends JpaRepository<Group, Long>{
    // Todo add the custom search query
}
