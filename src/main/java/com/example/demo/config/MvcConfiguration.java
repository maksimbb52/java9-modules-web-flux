package com.example.demo.config;

import com.example.demo.controller.UserController;
import com.example.demo.custom.InitNotify;
import com.example.demo.dao.UserRepository;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.KotlinService;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.KotlinServiceImpl;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MvcConfiguration implements DefaultConfiguration, InitNotify {

    @Bean
    public UserMapper userMapper() {
        return new UserMapper();
    }

    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserServiceImpl(userMapper(), userRepository);
    }

    @Bean
    public KotlinService kotlinService(UserRepository userRepository) {
        return new KotlinServiceImpl(userMapper(), userRepository);
    }

    @Bean
    public UserController userController() {
        return new UserController(userService(null), kotlinService(null));
    }
}
