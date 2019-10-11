package com.example.demo.dao;

import com.example.demo.entity.BookDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookRepository extends ReactiveMongoRepository<BookDocument, Long> {

    Flux<BookDocument> findAll();
    Mono<BookDocument> findByName(String name);
}
