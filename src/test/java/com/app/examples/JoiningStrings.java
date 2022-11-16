package com.app.examples;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

class JoiningStrings {

    @Test
    void joiningStrings() {
        var names = List.of("anna", "john", "marcos", "helena", "yasmin");
        // "Anna, John, Marcos, Helena, Yasmin"
        var joinedStrings = new StringBuilder();
        for (String name : names) {
            name = capitalizeFirstLetter(name);
            if (joinedStrings.isEmpty()) {
                joinedStrings.append(name);
            } else {
                joinedStrings.append(", ");
                joinedStrings.append(name);
            }
        }
        System.out.println(joinedStrings);
    }

    private static String capitalizeFirstLetter(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    @Test
    void joiningStringsWithStream() {
        var names = List.of("anna", "john", "marcos", "helena", "yasmin");
        // "Anna, John, Marcos, Helena, Yasmin"
        var joinedStrings = names.stream()
                .map(JoiningStrings::capitalizeFirstLetter)
                .collect(Collectors.joining(", "));
        System.out.println(joinedStrings);
    }

}
