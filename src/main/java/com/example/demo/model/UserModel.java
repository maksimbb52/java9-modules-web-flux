package com.example.demo.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserModel {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
}
