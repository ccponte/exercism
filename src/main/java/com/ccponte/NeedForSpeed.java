package com.ccponte;

class NeedForSpeed {

    private final int speed;
    private final int batteryDrain;
    private int distance = 0;
    private int battery = 100;

    public NeedForSpeed(int speed,
                        int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public int getBattery() {
        return battery;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (!this.batteryDrained()) {
            this.distance = this.distance + this.speed;
            this.battery = this.battery - this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private final int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        return ((car.getBattery() / car.getBatteryDrain()) * car.getSpeed()) >= this.distance;
    }
}
