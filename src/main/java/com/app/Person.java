package com.app;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Person {

    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String gender;
    private final Integer age;

}