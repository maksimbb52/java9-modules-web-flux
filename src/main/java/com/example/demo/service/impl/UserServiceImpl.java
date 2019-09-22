package com.example.demo.service.impl;

import com.example.demo.dao.UserRepository;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

//    @Override
//    public List<UserModel> findAll() {
//        return userRepository.findAll()
//                .stream()
//                .map(userMapper::entityToModel)
//                .collect(Collectors.toList());
//    }

    @Override
    public UserModel findById(Long id) {
        return userMapper.entityToModel(userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User with id = " + id + " was not found")
        ));
    }

}
