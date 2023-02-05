package com.ccponte;

class Scrabble {

    enum Letters {
        A(1),
        B(3),
        C(3),
        D(2),
        E(1),
        F(4),
        G(2),
        H(4),
        I(1),
        J(8),
        K(5),
        L(1),
        M(3),
        N(1),
        O(1),
        P(3),
        Q(10),
        R(1),
        S(1),
        T(1),
        U(1),
        V(4),
        W(4),
        X(8),
        Y(4),
        Z(10);

        private int value;

        Letters(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    private String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        int score = 0;
        for (Character letter : this.word.toCharArray()) {
            score += Letters.valueOf(String.valueOf(letter).toUpperCase()).getValue();
        }

        return score;
    }

}
