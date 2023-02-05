package com.ccponte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        List<Signal> signalList = new ArrayList<>();

        if ((number & 1) == 1) {
            signalList.add(Signal.WINK);
        }

        if ((number & 2) == 2) {
            signalList.add(Signal.DOUBLE_BLINK);
        }

        if ((number & 4) == 4) {
            signalList.add(Signal.CLOSE_YOUR_EYES);
        }

        if ((number & 8) == 8) {
            signalList.add(Signal.JUMP);
        }

        if ((number & 16) == 16) {
            Collections.reverse(signalList);
        }

        return signalList;
    }

}
