package com.ccponte;

public class Blackjack {

    enum Card {
        ace(11),
        two(2),
        three(3),	
        four(4),
        five(5),
        six(6),
        seven(7),	
        eight(8),
        nine(9),
        ten(10),
        jack(10),
        queen(10),
        king(10),
        other(0);

        private int value;

        Card(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }
    
    public int parseCard(String card) {
        return Card.valueOf(card).getValue();
    }

    public boolean isBlackjack(String card1, String card2) {
        return (parseCard(card1) + parseCard(card2) == 21);
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (!isBlackjack) {
            return "P";
        } else if (dealerScore >= 10) {
            return "S";
        } else {
            return "W";
        }
    }

    public String smallHand(int handScore, int dealerScore) {

        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else if (dealerScore >= 7) {
            return "H";
        } else {
            return "S";
        }
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
