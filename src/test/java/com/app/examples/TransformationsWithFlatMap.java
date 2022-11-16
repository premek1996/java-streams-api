package com.app.examples;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class TransformationsWithFlatMap {

    private static final List<List<String>> arrayListOfNames = List.of(
            List.of("Mariam", "Alex", "Ismail"),
            List.of("John", "Alesha", "Andre"),
            List.of("Susy", "Ali")
    );

    @BeforeEach
    void setUp() {
        System.out.println(arrayListOfNames);
    }

    @Test
    void withoutFlatMap() {
        // [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]
        var names = new ArrayList<String>();
        arrayListOfNames.forEach(names::addAll);
        System.out.println(names);
    }

    @Test
    void withFlatMap() {
        // [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]
        var names = arrayListOfNames.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(names);
    }

    @Test
    void flatMapWithOptionals() {
        var optionals = List.of(
                Optional.of("Amigos"),
                Optional.of("Code")
        );
        System.out.println(optionals);
        var strings = optionals.stream()
                .flatMap(Optional::stream)
                .toList();
        System.out.println(strings);
    }

}

