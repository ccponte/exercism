package com.ccponte;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = new int[7];
        for (int i = 7; i >= 1; i--) {
            lastWeek[7-i] = this.birdsPerDay[this.birdsPerDay.length - i];
        }
        return lastWeek;
    }

    public int getToday() {
        if (this.birdsPerDay.length == 0) {
            return 0;
        } else {
            return this.birdsPerDay[this.birdsPerDay.length-1];
        }
    }

    public void incrementTodaysCount() {
        int birdsToday = this.birdsPerDay[this.birdsPerDay.length-1];
        this.birdsPerDay[this.birdsPerDay.length-1] = birdsToday + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }    
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int countBirds = 0;
        int daysToCount = Math.min(numberOfDays, this.birdsPerDay.length);
        for (int i = 0; i < daysToCount; i++) {
            countBirds = countBirds + this.birdsPerDay[i];
        }
        return countBirds;
    }

    public int getBusyDays() {
        int countDays = 0;
        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                countDays++;
            }    
        }
        return countDays;
    }
}
