package com.company;

public class Main {
    public static void main(String[] args) {
    Hero hero[]={new Magic(),new Medic(),new Warrior()};
        for (int i = 0; i < hero.length; i++) {
            hero[i].applySuperAbility("CRITICAL DAMAGE");

        }

    }
}
