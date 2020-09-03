package com.coding.challenges.codewars;

//Create a function that returns the name of the winner in a fight between two fighters.
//Each fighter takes turns attacking the other and whoever kills the other first is victorious.
//Death is defined as having health <= 0.
//Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
//Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0.
//You can mutate the Fighter objects.

public class FighterGame {

    public static void main(String[] args) {
        System.out.println(declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        boolean ifFirstIsAttacker = firstAttacker.equals(fighter1.name);
        return ifFirstIsAttacker ? attack(fighter1, fighter2) : attack(fighter2, fighter1);
    }

    private static String attack(Fighter attacker, Fighter victim) {
        victim.health -= attacker.damagePerAttack;
        if(victim.health <= 0)
            return attacker.name;
        return attack(victim, attacker);
    }
}

class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}