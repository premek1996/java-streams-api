package com.app.examples;


import com.app.Person;
import com.app.mockdata.MockTestData;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

class HowStreamsWork {

    @Test
    void understandingCollect() {
        var emails = MockTestData.getPeople()
                .stream()
                .map(Person::getEmail)
                .collect(Collectors.toList());

        emails.forEach(System.out::println);
    }

    @Test
    void intermediateAndTerminalOperations() {
        System.out.println(
                MockTestData.getCars()
                        .stream()
                        .filter(car -> {
                            System.out.println("filter car " + car);
                            return car.getPrice() < 10000;
                        })
                        .map(car -> {
                            System.out.println("mapping car " + car);
                            return car.getPrice();
                        })
                        .map(price -> {
                            System.out.println("mapping price " + price);
                            return price + (price * .14);
                        })
                        .collect(Collectors.toList())
        );
    }
}
