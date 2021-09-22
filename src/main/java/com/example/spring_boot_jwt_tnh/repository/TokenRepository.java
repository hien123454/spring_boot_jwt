package com.example.spring_boot_jwt_tnh.repository;


import com.example.spring_boot_jwt_tnh.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository
        extends JpaRepository<Token, Long> {

}
