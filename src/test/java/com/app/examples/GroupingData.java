package com.app.examples;


import com.app.Car;
import com.app.mockdata.MockTestData;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class GroupingData {

    @Test
    void simpleGrouping() {
        var cars = MockTestData.getCars();
        var carsGroupedByMake = cars.stream()
                .collect(Collectors.groupingBy(Car::getMake));
        System.out.println(carsGroupedByMake);
    }

    @Test
    void groupingAndCounting() {
        var names = List.of(
                "John",
                "John",
                "Mariam",
                "Alex",
                "Mohammado",
                "Mohammado",
                "Vincent",
                "Alex",
                "Alex"
        );
        var countedNames = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countedNames);
    }

}