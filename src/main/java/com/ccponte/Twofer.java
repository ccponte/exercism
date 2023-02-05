package com.ccponte;

public class Twofer {
    public String twofer(String name) {
        String actualName = (name == null ? "you" : name);
        return String.format("One for %s, one for me.", actualName);
    }
}
