package com.app.examples;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Comparator.naturalOrder;

class MinMax {

    @Test
    void min() {
        var numbers = List.of(1, 2, 3, 100, 23, 93, 99);
        var min = numbers.stream()
                .min(naturalOrder())
                .orElseThrow();
        System.out.println(min);
    }

    @Test
    void max() {
        var numbers = List.of(1, 2, 3, 100, 23, 93, 99);
        var max = numbers.stream()
                .max(naturalOrder())
                .orElseThrow();
        System.out.println(max);
    }

}
