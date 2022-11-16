package com.app.examples;


import com.app.Car;
import com.app.mockdata.MockTestData;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class StatisticsWithStreams {

    @Test
    void count() {
        var cars = MockTestData.getCars();
        long fordCount = cars.stream()
                .filter(car -> car.getMake().equalsIgnoreCase("Ford"))
                .filter(car -> car.getYear() > 2010)
                .count();
        System.out.println(fordCount);
    }

    @Test
    void min() {
        var cars = MockTestData.getCars();
        var minPrice = cars.stream()
                .mapToDouble(Car::getPrice)
                .min()
                .orElse(0);
        System.out.println(minPrice);
    }

    @Test
    void max() {
        var cars = MockTestData.getCars();
        var maxPrice = cars.stream()
                .mapToDouble(Car::getPrice)
                .max()
                .orElse(0);
        System.out.println(maxPrice);
    }


    @Test
    void average() {
        var cars = MockTestData.getCars();
        var averagePrice = cars.stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0);
        System.out.println(averagePrice);
    }

    @Test
    void sum() {
        var cars = MockTestData.getCars();
        var sum = cars.stream()
                .mapToDouble(Car::getPrice)
                .sum();
        System.out.println(BigDecimal.valueOf(sum));
    }

    @Test
    void statistics() {
        var cars = MockTestData.getCars();
        var doubleSummaryStatistics = cars.stream()
                .mapToDouble(Car::getPrice)
                .summaryStatistics();
        System.out.println(doubleSummaryStatistics);
    }

}