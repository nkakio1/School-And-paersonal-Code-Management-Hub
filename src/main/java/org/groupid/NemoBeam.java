package org.groupid;

import org.springframework.stereotype.Component;

@Component("Nemobeam")
public class NemoBeam implements FightingPower {
    @Override
    public String getFightingPowerDesc() {
        return "shooting a Squid Beam!";
    }
}