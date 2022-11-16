package com.app.mockdata;


import com.app.Car;
import com.app.Person;
import com.google.common.io.Resources;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MockTestData {

    @SneakyThrows
    public static List<Person> getPeople() {
        InputStream inputStream = Resources.getResource("people.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Person>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }

    @SneakyThrows
    public static List<Car> getCars() {
        InputStream inputStream = Resources.getResource("cars.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Car>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }

}
