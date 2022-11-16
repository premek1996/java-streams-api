package com.app;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class PersonDTO {

    private final Integer id;
    private final String name;
    private final Integer age;

    public static PersonDTO map(Person person) {
        return new PersonDTO(
                person.getId(),
                person.getFirstName(),
                person.getAge());
    }

}