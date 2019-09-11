package com.example.demo.service.impl;

import com.example.demo.dao.DefaultRepository;
import com.example.demo.mapper.DefaultMapper;
import com.example.demo.model.DefaultModel;
import com.example.demo.service.DefaultService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class DefaultServiceImpl implements DefaultService {

    private final DefaultRepository defaultRepository;
    private final DefaultMapper defaultMapper;

    @Override
    public List<DefaultModel> findAll() {
        return defaultRepository.findAll()
                .stream()
                .map(defaultMapper::entityToModel)
                .collect(Collectors.toList());
    }

}
