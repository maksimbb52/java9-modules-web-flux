package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DefaultModel {

    public DefaultModel(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    private Long id;
    private String brand;
    private String model;
}
