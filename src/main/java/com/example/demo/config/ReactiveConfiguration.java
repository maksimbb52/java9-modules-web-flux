package com.example.demo.config;

import com.example.demo.controller.BookController;
import com.example.demo.dao.BookRepository;
import com.example.demo.mapper.BookMapper;
import com.example.demo.service.BookService;
import com.example.demo.service.impl.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories(basePackageClasses = BookRepository.class)
public class ReactiveConfiguration {

    @Bean
    public BookMapper bookMapper() {
        return new BookMapper();
    }

    @Bean
    public BookService bookService(BookRepository bookRepository) {
        return new BookServiceImpl(bookMapper(), bookRepository);
    }

    @Bean
    public BookController bookController() {
        return new BookController(bookService(null));
    }
}
