package com.example.demo.controller;

import com.example.demo.service.DefaultService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@RequiredArgsConstructor
@RequestMapping("/")
public class DefaultController {

    private final DefaultService defaultService;

    @GetMapping("/default")
    public String getDefaults() {
        return defaultService.findAll().toString();
    }
}
