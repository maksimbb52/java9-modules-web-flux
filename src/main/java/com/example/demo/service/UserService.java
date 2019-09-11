package com.example.demo.service;

import com.example.demo.model.UserModel;

import java.util.List;

public interface UserService {

    List<UserModel> findAll();

    UserModel findById(Long id);
}
