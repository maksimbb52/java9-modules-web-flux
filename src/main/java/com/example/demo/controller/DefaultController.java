package com.example.demo.controller;

import com.example.demo.model.DefaultModel;
import com.example.demo.service.DefaultService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
@RequiredArgsConstructor
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class DefaultController {

    private final DefaultService defaultService;

    @GetMapping("/default")
    public List<DefaultModel> getDefaults() {
        return defaultService.findAll();
    }
}
