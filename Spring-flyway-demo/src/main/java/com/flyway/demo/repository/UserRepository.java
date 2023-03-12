package com.flyway.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flyway.demo.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
