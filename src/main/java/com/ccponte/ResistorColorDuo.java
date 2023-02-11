package com.ccponte;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ResistorColorDuo {

    private final Map<String, Integer> resistorColorsMap = new HashMap<>(
            Map.ofEntries(
                    Map.entry("black", 0),
                    Map.entry("brown", 1),
                    Map.entry("red", 2),
                    Map.entry("orange", 3),
                    Map.entry("yellow", 4),
                    Map.entry("green", 5),
                    Map.entry("blue", 6),
                    Map.entry("violet", 7),
                    Map.entry("grey", 8),
                    Map.entry("white", 9)
            )
    );

    int value(String[] colors) {
        return Integer.parseInt(String.format("%d%d",
                                              resistorColorsMap.get(colors[0]),
                                              resistorColorsMap.get(colors[1])));
    }


    //  Solution using decimal system
//    final List<String> codes = Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");
//    int value(String[] colors) {
//        return codes.indexOf(colors[0]) * 10 + codes.indexOf(colors[1]);
//    }

}
