package com.example.demo.service.impl;

import com.example.demo.dao.BookRepository;
import com.example.demo.mapper.BookMapper;
import com.example.demo.model.BookModel;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static java.time.Duration.ofSeconds;

@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookMapper bookMapper;
    private final BookRepository bookRepository;

    @Override
    public Flux<BookModel> findAll() {
        return bookRepository.findAll()
                        // Difficult calculation
                             .delayElements(ofSeconds(1))
                             .map(bookMapper::documentToModel);
    }

    @Override
    public Mono<BookModel> findByName(String name) {
        return bookRepository.findByName(name)
                             .delayElement(ofSeconds(1))
                             .map(bookMapper::documentToModel);
    }

    @EventListener
    public void initDb(ContextRefreshedEvent ctxStartEvt) {
        // Reactive stream is not needed in this situation.
        // Just an example.
        bookRepository
                .deleteAll()
                .thenMany(
                        Flux.fromIterable(getBookModels())
                            //  difficult calculation
                            .delayElements(Duration.ofMillis(1000))
                            .map(bookMapper::modelToDocument)
                            .log()
                            .flatMap(bookRepository::save)
                )
                .subscribe();
    }

    @NotNull
    private List<BookModel> getBookModels() {
        return Arrays.asList(
                new BookModel(1L, "Neuromancer", "William Gibson"),
                new BookModel(2L, "Drei Kameraden", "Erich Maria Remark"),
                new BookModel(3L, "The Godfather", "Mario Puzo"),
                new BookModel(4L, "Put' k Uspehu", "Nikolai Sobolev"),
                new BookModel(5L, "temp temp0", "temp temp0"),
                new BookModel(6L, "Steve Jobs", "Walter Isaacson"),
                new BookModel(7L, "temp temp", "temp temp"),
                new BookModel(8L, "temp temp1", "temp temp1"),
                new BookModel(9L, "temp temp2", "temp temp2"),
                new BookModel(10L, "temp temp3", "temp temp3"),
                new BookModel(11L, "temp temp4", "temp temp4"),
                new BookModel(12L, "temp temp5", "temp temp5"),
                new BookModel(12L, "temp temp6", "temp temp6"),
                new BookModel(14L, "temp temp7", "temp temp7"),
                new BookModel(15L, "temp temp8", "temp temp8"),
                new BookModel(16L, "temp temp9", "temp temp9"),
                new BookModel(17L, "temp temp10", "temp temp10"),
                new BookModel(18L, "temp temp11", "temp temp11"),
                new BookModel(19L, "temp temp12", "temp temp12"),
                new BookModel(20L, "temp temp13", "temp temp13"),
                new BookModel(21L, "temp temp14", "temp temp14"),
                new BookModel(22L, "temp temp15", "temp temp15"),
                new BookModel(23L, "temp temp16", "temp temp16"),
                new BookModel(24L, "temp temp17", "temp temp17"),
                new BookModel(25L, "temp temp18", "temp temp18"),
                new BookModel(26L, "temp temp19", "temp temp19"),
                new BookModel(27L, "temp temp20", "temp temp20"),
                new BookModel(28L, "temp temp21", "temp temp21"),
                new BookModel(29L, "temp temp22", "temp temp22"),
                new BookModel(30L, "temp temp23", "temp temp23"),
                new BookModel(31L, "temp temp24", "temp temp24"),
                new BookModel(32L, "temp temp25", "temp temp25"),
                new BookModel(33L, "temp temp26", "temp temp26"),
                new BookModel(34L, "temp temp27", "temp temp27"),
                new BookModel(35L, "temp temp28", "temp temp28")
        );
    }
}
