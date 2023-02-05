package com.ccponte;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate = 0;
        
        if (speed <= 4) {
            successRate = 100;
        } else if (speed <= 8) {
            successRate = 90;
        } else if (speed == 9) {
            successRate = 80;
        } else if (speed == 10) {
            successRate = 77;
        }

        return speed * 221 * (successRate / 100);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
