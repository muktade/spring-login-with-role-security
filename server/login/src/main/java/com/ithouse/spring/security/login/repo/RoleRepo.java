package com.ithouse.spring.security.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ithouse.spring.security.login.entity.Role;

public interface RoleRepo extends JpaRepository<Role, Long>{

}
