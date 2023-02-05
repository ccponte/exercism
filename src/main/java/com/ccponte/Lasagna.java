package com.ccponte;

public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualMinutesInTheOven) {
        return this.expectedMinutesInOven() - actualMinutesInTheOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInTheOven) {
        return this.preparationTimeInMinutes(numberOfLayers) + actualMinutesInTheOven;
    }
}
