package com.example.spring_boot_jwt_tnh.service;


import com.example.spring_boot_jwt_tnh.entity.Token;

public interface TokenService {
    Token createToken(Token token);
}
