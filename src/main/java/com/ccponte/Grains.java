package com.ccponte;

import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {

        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

//        "Brute force" solution
//        BigInteger grains = BigInteger.ONE;
//        for (int i = 2; i <= square; i++) {
//            grains = grains.multiply(BigInteger.TWO);
//        }
//        return grains;

//        Mathematical solution
        return BigInteger.TWO.pow(square - 1);
    }

    BigInteger grainsOnBoard() {
//        "Brute force" solution
//        BigInteger totalGrains = BigInteger.ZERO;
//        for (int i = 1; i <= 64; i++) {
//            totalGrains = totalGrains.add(grainsOnSquare(i));
//        }
//        return totalGrains;

        return BigInteger.TWO.pow(64).subtract(BigInteger.ONE);
    }

}
