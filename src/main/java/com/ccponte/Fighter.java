package com.ccponte;

abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {

    boolean isSpellPrepared = false;

    @Override
    boolean isVulnerable() {
        return !isSpellPrepared;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return isSpellPrepared ? 12 : 3;
    }

    void prepareSpell() {
        this.isSpellPrepared = true;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

}
