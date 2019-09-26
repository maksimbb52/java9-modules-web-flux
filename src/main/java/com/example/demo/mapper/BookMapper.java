package com.example.demo.mapper;

import com.example.demo.entity.BookDocument;
import com.example.demo.model.BookModel;

public class BookMapper {

    public BookModel documentToModel(BookDocument document) {
        BookModel model = new BookModel();
        model.setAuthor(document.getAuthor());
        model.setId(document.getId());
        model.setName(document.getName());
        return model;
    }

    public BookDocument modelToDocument(BookModel model) {
        BookDocument document = new BookDocument();
        document.setAuthor(model.getAuthor());
        document.setId(model.getId());
        document.setName(model.getName());
        return document;
    }
}
