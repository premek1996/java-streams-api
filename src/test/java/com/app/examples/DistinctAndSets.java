package com.app.examples;


import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DistinctAndSets {

    @Test
    void distinct() {
        var numbers = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        var distinctNumbers = numbers.stream().distinct().toList();
        System.out.println(distinctNumbers);
        assertThat(distinctNumbers).hasSize(9);
    }

    @Test
    void distinctWithSet() {
        var numbers = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        //var distinctNumbers = numbers.stream().collect(Collectors.toSet());
        var distinctNumbers = new HashSet<>(numbers);
        System.out.println(distinctNumbers);
        assertThat(distinctNumbers).hasSize(9);
    }

}
