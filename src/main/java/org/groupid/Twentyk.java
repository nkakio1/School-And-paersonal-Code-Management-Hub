package org.groupid;

import org.springframework.stereotype.Component;

@Component("Twentyk")
public class Twentyk implements FightingPower {
    @Override
    public String getFightingPowerDesc() {
        return "attacking from 20,000 Leagues below!";
    }
}