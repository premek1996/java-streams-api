package com.app.examples;

import com.app.mockdata.MockTestData;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Filtering {

    @Test
    void filter() {
        var cars = MockTestData.getCars();
        var filterCars = cars.stream()
                .filter(car -> car.getPrice() <= 20_000)
                .toList();
        System.out.println(filterCars);
    }

    @Test
    void dropWhile() {
        System.out.println("using filter");
        Stream.of(2, 4, 6, 8, 9, 10, 12)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();
        System.out.println("using dropWhile");
        Stream.of(2, 4, 6, 8, 9, 10, 12)
                .dropWhile(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
    }

    @Test
    void takeWhile() {
        // using filter
        System.out.println("using filter");
        Stream.of(2, 4, 6, 8, 9, 10, 12)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();
        System.out.println("using take while");
        Stream.of(2, 4, 6, 8, 9, 10, 12)
                .takeWhile(n -> n % 2 == 0)
                .forEach((n -> System.out.print(n + " ")));
    }

    @Test
    void findFirst() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        var i = Arrays.stream(numbers)
                .filter(n -> n == 9)
                .findFirst()
                .orElseThrow();

        System.out.println(i);
    }

    @Test
    void findAny() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10};

        var i = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .findAny()
                .orElseThrow();

        System.out.println(i);
    }

    @Test
    void allMatch() {
        int[] even = {2, 4, 6, 8, 10};
        boolean allEven = Arrays.stream(even)
                .allMatch(n -> n % 2 == 0);
        System.out.println(allEven);
        assertThat(allEven).isTrue();
    }

    @Test
    void anyMatch() {
        int[] evenAndOneOdd = {2, 4, 6, 8, 10, 11};
        boolean anyOdd = Arrays.stream(evenAndOneOdd)
                .anyMatch(n -> n % 2 == 1);
        System.out.println(anyOdd);
        assertThat(anyOdd).isTrue();
    }

}



