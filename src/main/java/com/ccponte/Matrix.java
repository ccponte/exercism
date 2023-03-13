package com.ccponte;

import java.util.Arrays;
import java.util.stream.IntStream;

class Matrix {

    int[][] matrix;

    Matrix(String matrixAsString) {
        matrix = Arrays.stream(matrixAsString.split("\n"))
                       .map(x -> Arrays.stream(x.split("\\s"))
                                       .mapToInt(Integer::parseInt).toArray())
                       .toArray(int[][]::new);
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        return IntStream.range(0, matrix.length).map(i -> matrix[i][columnNumber - 1]).toArray();
    }
}
