package com.ccponte;

public class ElonsToyCar {

    private int distance = 0;
    private int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.distance);
    }

    public String batteryDisplay() {
        return battery > 0 ? String.format("Battery at %d%%", this.battery) :
                             "Battery empty";
    }

    public void drive() {
        if (battery > 0) {
            distance += 20;
            battery -= 1;
        }
    }
}
