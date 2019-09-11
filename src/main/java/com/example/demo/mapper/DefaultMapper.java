package com.example.demo.mapper;

import com.example.demo.entity.DefaultEntity;
import com.example.demo.model.DefaultModel;

public class DefaultMapper {

    public DefaultModel entityToModel(DefaultEntity entity) {
        DefaultModel model = new DefaultModel();
        model.setId(entity.getId());
        model.setModel(entity.getModel());
        model.setBrand(entity.getBrand());
        return model;
    }
}
