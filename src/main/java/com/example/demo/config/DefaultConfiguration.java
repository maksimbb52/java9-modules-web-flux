package com.example.demo.config;

import com.example.demo.controller.DefaultController;
import com.example.demo.dao.DefaultRepository;
import com.example.demo.mapper.DefaultMapper;
import com.example.demo.service.DefaultService;
import com.example.demo.service.impl.DefaultServiceImpl;
import org.springframework.context.annotation.Bean;

public interface DefaultConfiguration {

    @Bean
    default DefaultMapper defaultMapper() {
        return new DefaultMapper();
    }

    @Bean
    default DefaultService defaultService(DefaultRepository defaultRepository) {
        return new DefaultServiceImpl(defaultRepository, defaultMapper());
    }

    @Bean
    default DefaultController defaultController() {
        return new DefaultController(defaultService(null));
    }

}
