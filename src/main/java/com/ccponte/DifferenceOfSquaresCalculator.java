package com.ccponte;

import java.util.stream.IntStream;

public class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return (int) Math.pow((input * (input + 1) / 2), 2);
    }

    int computeSumOfSquaresTo(int input) {
        return IntStream.rangeClosed(1, input)
                        .map(i -> (int) Math.pow(i, 2))
                        .sum();
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
