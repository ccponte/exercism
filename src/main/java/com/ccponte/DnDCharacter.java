package com.ccponte;

import java.util.Random;

class DnDCharacter {

    int numberOfDice = 4;
    int numberOfSidesOfDice = 6;
    int numberOfDischargedValues = 1;


    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

    Random random = new Random();

    DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
    }

    int ability() {
        return random.ints(numberOfDice, 1, numberOfSidesOfDice + 1)
                .sorted()
                .skip(numberOfDischargedValues)
                .sum();
    }

    int modifier(int input) {
        return Math.floorDiv((input - 10 ), 2 );
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

}
