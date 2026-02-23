package org.groupid;

public class Character {
    private String name;
    private double health;
    private double strength;
    private FightingPower fightingPower;

    public void useFightingPower() {
        System.out.println(name + " is " + fightingPower.getFightingPowerDesc());
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public void setHealth(double health) { this.health = health; }
    public void setStrength(double strength) { this.strength = strength; }
    public void setFightingPower(FightingPower fightingPower) { this.fightingPower = fightingPower; }
}