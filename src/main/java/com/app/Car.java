package com.app;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Car {

    private final Integer id;
    private final String make;
    private final String model;
    private final String color;
    private final Integer year;
    private final Double price;

}
