package com.myapp.springbootloginregistration.service;

import org.springframework.stereotype.Service;

import com.myapp.springbootloginregistration.entity.User;

@Service
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
