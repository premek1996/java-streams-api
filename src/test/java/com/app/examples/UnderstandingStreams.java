package com.app.examples;

import com.app.Person;
import com.app.mockdata.MockTestData;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.stream.Collectors;

class UnderstandingStreams {

    @Test
    void collect() {
        var emails = MockTestData.getPeople()
                .stream()
                .map(Person::getEmail)
                //.toList()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        emails.forEach(System.out::println);
    }

    @Test
    void lazy() {
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
