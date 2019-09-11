package com.example.demo.mapper;

import com.example.demo.entity.UserEntity;
import com.example.demo.model.UserModel;

public class UserMapper {

    public UserModel entityToModel(UserEntity entity) {
        UserModel model = new UserModel();
        model.setId(entity.getId());
        model.setFirstName(entity.getFirstName());
        model.setLastName(entity.getLastName());
        model.setBirthDate(entity.getBirthDate());
        return model;
    }
}
