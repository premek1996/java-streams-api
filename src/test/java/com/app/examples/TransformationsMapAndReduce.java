package com.app.examples;

import com.app.Car;
import com.app.PersonDTO;
import com.app.mockdata.MockTestData;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TransformationsMapAndReduce {

    @Test
    void yourFirstTransformationWithMap() {
        var people = MockTestData.getPeople();
        var peopleDTO = people.stream()
                .map(PersonDTO::map)
                .toList();
        System.out.println(peopleDTO);
    }

    @Test
    void mapToDoubleAndFindAverageCarPrice() {
        var cars = MockTestData.getCars();
        var averagePrice = cars.stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0);
        System.out.println(averagePrice);
    }

    @Test
    void reduce() {
        int[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
        var sum = Arrays.stream(integers)
                .reduce(0, Integer::sum);
        var sub = Arrays.stream(integers)
                .reduce(0, (i1, i2) -> i1 - i2);
        System.out.println(sum);
        System.out.println(sub);
    }

}

