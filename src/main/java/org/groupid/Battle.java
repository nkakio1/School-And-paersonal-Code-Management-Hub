package org.groupid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class Battle {
    @Autowired
    private Character character1;

    @Autowired
    private Character character2;

    @Autowired
    private BattleGround battleground;

    public void setBattleground(BattleGround battleground) {
        this.battleground = battleground;
    }

    public void fight() {
        System.out.println("    BATTLE START.   ");
        System.out.print(battleground.getBattleGroundDesc() + ", ");
        System.out.println(character1.getName() + " and " + character2.getName() + " begin to fight.");
        System.out.println(character1.getName() + " starting HP: " + character1.getHealth());
        System.out.println(character2.getName() + " starting HP: " + character2.getHealth());
        System.out.println("\n");

        Random random = new Random();
        Character firstAttacker;
        Character secondAttacker;

        if (random.nextBoolean()) {
            firstAttacker = character1;
            secondAttacker = character2;
        } else {
            firstAttacker = character2;
            secondAttacker = character1;
        }

        System.out.println(firstAttacker.getName() + " attacks first!\n");

        int round = 1;

        while (firstAttacker.isAlive() && secondAttacker.isAlive()) {
            System.out.println("    Round " + round + "    ");

            firstAttacker.useFightingPower();
            double damage1 = firstAttacker.getStrength();
            if (random.nextInt(100) < 10) {
                damage1 = damage1 * 1.10;
                System.out.println(" CRITICAL HIT!");
            }
            secondAttacker.takeDamage(damage1);
            System.out.println("    " + secondAttacker.getName() + " takes " + String.format("%.1f", damage1) + " damage. HP remaining: " + String.format("%.1f", secondAttacker.getHealth()));

            if (!secondAttacker.isAlive()) {
                System.out.println("\n " + secondAttacker.getName() + " has been defeated! " + firstAttacker.getName() + " wins!");
                break;
            }

            secondAttacker.useFightingPower();
            double damage2 = secondAttacker.getStrength();
            if (random.nextInt(100) < 10) {
                damage2 = damage2 * 1.10;
                System.out.println(" CRITICAL HIT!");
            }
            firstAttacker.takeDamage(damage2);
            System.out.println("    " + firstAttacker.getName() + " takes " + String.format("%.1f", damage2) + " damage. HP remaining: " + String.format("%.1f", firstAttacker.getHealth()));

            if (!firstAttacker.isAlive()) {
                System.out.println("\n " + firstAttacker.getName() + " has been defeated! " + secondAttacker.getName() + " wins!");
                break;
            }

            firstAttacker.increaseStrength();
            secondAttacker.increaseStrength();

            System.out.println(" Both fighters grow 10% stronger!");
            System.out.println();
            round++;
        }
    }
}