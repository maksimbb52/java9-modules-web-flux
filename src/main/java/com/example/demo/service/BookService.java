package com.example.demo.service;

import com.example.demo.model.BookModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {

    Flux<BookModel> findAll();
    Mono<BookModel> findByName(String name);
}
