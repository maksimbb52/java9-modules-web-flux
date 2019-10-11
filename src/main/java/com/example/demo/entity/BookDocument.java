package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Document
public class BookDocument {

    @Id
    @GeneratedValue()
    private Long id;
    private String name;
    private String author;
}
