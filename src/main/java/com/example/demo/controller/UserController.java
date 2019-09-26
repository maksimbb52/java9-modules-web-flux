package com.example.demo.controller;

import com.example.demo.model.UserModel;
import com.example.demo.service.KotlinService;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
@RequiredArgsConstructor
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private final UserService userService;
    private final KotlinService kotlinService;

    private static final Logger logger = LogManager.getLogger(UserController.class);

    @GetMapping
    public String getWelcome() {
        logger.log(Level.INFO, "Welcome!");
        return "Welcome!";
    }

    @GetMapping("/user/{id}")
    public UserModel getUser(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("/users")
    public List<UserModel> getUsers() {
        return kotlinService.findAll();
    }
}
