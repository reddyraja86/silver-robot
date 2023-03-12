package com.demo.cache.SpringCustomCacheDemo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {

}
