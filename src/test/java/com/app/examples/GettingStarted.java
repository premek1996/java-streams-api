package com.app.examples;

import com.app.Person;
import com.app.mockdata.MockTestData;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class GettingStarted {

    @Test
    void imperativeApproach() {
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people
        var people = MockTestData.getPeople();
        var youngPeople = new ArrayList<>();
        int limit = 10;
        for (Person person : people) {
            if (person.getAge() <= 18) {
                youngPeople.add(person);
                if (youngPeople.size() == limit) {
                    break;
                }
            }
        }
        System.out.println(youngPeople);
    }

    @Test
    void declarativeApproachUsingStreams() {
        var people = MockTestData.getPeople();
        var youngPeople = people.stream()
                .filter(person -> person.getAge() <= 18)
                .limit(10)
                .toList();
        System.out.println(youngPeople);
    }

}
