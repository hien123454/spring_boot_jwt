package com.example.spring_boot_jwt_tnh.service;

import com.example.spring_boot_jwt_tnh.authen.UserPrincipal;
import com.example.spring_boot_jwt_tnh.entity.User;

public interface UserService {
    User createUser(User user);

}
