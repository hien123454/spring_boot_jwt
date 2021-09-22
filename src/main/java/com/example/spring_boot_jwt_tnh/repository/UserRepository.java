package com.example.spring_boot_jwt_tnh.repository;


import com.example.spring_boot_jwt_tnh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}