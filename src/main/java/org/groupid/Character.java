package org.groupid;

public class Character {
    private String name;
    private double health;
    private double strength;
    private FightingPower fightingPower;

    public void useFightingPower() {
        System.out.println(name + " is " + fightingPower.getFightingPowerDesc());
    }

    public void takeDamage(double damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void increaseStrength() {
        this.strength = this.strength * 1.10;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getHealth() { return health; }
    public void setHealth(double health) { this.health = health; }
    public double getStrength() { return strength; }
    public void setStrength(double strength) { this.strength = strength; }
    public void setFightingPower(FightingPower fightingPower) { this.fightingPower = fightingPower; }
}