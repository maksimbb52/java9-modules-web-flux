package com.example.demo.custom;

import javax.annotation.PostConstruct;

public interface InitNotify {

    @PostConstruct
    default void initNotify() {
        System.out.println(
                this.getClass().getSimpleName()
              + " bean has been initialized!"
        );
    }
}
