package com.ithouse.spring.security.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ithouse.spring.security.login.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
