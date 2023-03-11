package com.ccponte;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class WordCount {
    public Map<String, Integer> phrase(String input) {

        Map<String, Integer> result = new HashMap<>();
        String[] inputArray = input.replaceAll("[^A-Za-z0-9\\s\\']", " ")
                                   .replaceAll("(\\s*'\\B|\\B'\\s*)", " ")
                                   .replaceAll("\\s+", " ")
                                   .trim()
                                   .split("\\s");

        Arrays.stream(inputArray).forEach(word -> result.merge(word.toLowerCase(), 1, Integer::sum));

        return result;
    }
}
