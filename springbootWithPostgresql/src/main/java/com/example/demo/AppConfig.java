package com.example.demo;

import org.springframework.context.annotation.*;

import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl(); // or any other implementation of UserService
    }
}
