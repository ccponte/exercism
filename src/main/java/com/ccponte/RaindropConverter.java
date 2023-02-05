package com.ccponte;

import java.util.Map;
import java.util.TreeMap;

class RaindropConverter {

    String convert(int number) {

//        "if" approach
//        StringBuilder result = new StringBuilder();
//
//        if (number % 3 == 0) {
//            result.append("Pling");
//        }
//
//        if (number % 5 == 0) {
//            result.append("Plang");
//        }
//
//        if (number % 7 == 0) {
//            result.append("Plong");
//        }
//
//        if (result.toString().isEmpty()) {
//            return String.valueOf(number);
//        }
//
//        return result.toString();


//        "Map" approach
        StringBuilder result = new StringBuilder();
        TreeMap<Integer, String> mapRaindrops = new TreeMap <>(
                Map.of( 3, "Pling",
                        5, "Plang",
                        7, "Plong")
        );

        mapRaindrops.forEach((divisor, drop) -> {
            if (number % divisor == 0) {
                result.append(drop);
            }
        });

        return result.toString().isEmpty() ? String.valueOf(number) : result.toString();
    }

}
