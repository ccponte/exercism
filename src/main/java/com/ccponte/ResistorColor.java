package com.ccponte;

import java.util.Arrays;

class ResistorColor {

    enum Colors {
        black(0),
        brown(1),
        red(2),
        orange(3),
        yellow(4),
        green(5),
        blue(6),
        violet(7),
        grey(8),
        white(9);

        private final int value;
        Colors(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    int colorCode(String color) {
        return Colors.valueOf(color).getValue();
    }

    String[] colors() {
        return Arrays.stream(Colors.values()).map(Enum::name).toArray(String[]::new);
    }
}
