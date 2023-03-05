package com.ccponte;

import java.util.stream.IntStream;

public class NaturalNumber {

    int naturalNumber;

    NaturalNumber(int naturalNumber) {
        if (naturalNumber < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.naturalNumber = naturalNumber;
    }

    public Classification getClassification() {
        if (this.naturalNumber == 1) {
            return Classification.DEFICIENT;
        }

        // laingphearin's solution
        int aliquotSum = IntStream.rangeClosed(1, this.naturalNumber / 2)
                .filter(factor -> this.naturalNumber % factor == 0)
                .sum();

//        Set<Integer> aliquotSet = new HashSet<>();
//        aliquotSet.add(1);
//        for (int i = 2; i <= Math.sqrt(this.naturalNumber); i++) {
//            if (this.naturalNumber % i == 0) {
//                aliquotSet.add(i);
//                aliquotSet.add(this.naturalNumber / i);
//            }
//        }
//
//        int aliquotSum = aliquotSet.stream().mapToInt(Integer::intValue).sum();

        if (aliquotSum == this.naturalNumber) {
            return Classification.PERFECT;
        } else if (aliquotSum > this.naturalNumber) {
            return Classification.ABUNDANT;
        } else {
            return Classification.DEFICIENT;
        }
    }
}