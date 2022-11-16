package com.app.examples;


import com.app.mockdata.MockTestData;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class IntStreams {

    @Test
    void range() {
        System.out.println("with fori");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("with int stream exclusive");
        IntStream.range(0, 10)
                .forEach(System.out::println);

        System.out.println("with int stream inclusive");
        IntStream.rangeClosed(0, 10)
                .forEach(System.out::println);
    }

    // Loop through people using IntStream
    @Test
    void rangeIteratingLists() {
        var people = MockTestData.getPeople();
        IntStream.range(0, people.size())
                .forEach(i -> System.out.println(people.get(i)));
    }

    @Test
    void intStreamIterate() {
        IntStream.iterate(0, value -> value + 1)
                .limit(10)
                .forEach(System.out::println);
    }

    //        IntStream
    //        DoubleStream
    //        LongStream

}
