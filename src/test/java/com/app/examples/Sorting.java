package com.app.examples;

import com.app.Car;
import com.app.Person;
import com.app.mockdata.MockTestData;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

class Sorting {

    @Test
    void sortingStreamOfElements() {
        var people = MockTestData.getPeople();
        var sortedNames = people.stream()
                .map(Person::getFirstName)
                .sorted()
                .toList();
        System.out.println(sortedNames);
    }

    @Test
    void sortingStreamOfElementsReverse() {
        var people = MockTestData.getPeople();
        var reverseSortedByFirstName = people.stream()
                .map(Person::getFirstName)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(reverseSortedByFirstName);
    }

    @Test
    void sortingStreamOfObjets() {
        var people = MockTestData.getPeople();
        var sortedByFirstName = people.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .toList();
        System.out.println(sortedByFirstName);
    }

    @Test
    void sortingStreamOfObjetsReverse() {
        var people = MockTestData.getPeople();
        var reverseSortedByFirstName = people.stream()
                .sorted(Comparator.comparing(Person::getFirstName).reversed()
                        .thenComparing(Person::getEmail))
                .toList();
        System.out.println(reverseSortedByFirstName);
    }

    @Test
    void topTenMostExpensiveBlueCars() {
        var cars = MockTestData.getCars();
        var topTenMostExpensiveBlueCars = cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("blue"))
                .sorted(Comparator.comparingDouble(Car::getPrice).reversed())
                .limit(10)
                .toList();
        System.out.println(topTenMostExpensiveBlueCars);
    }

}
