package org.groupid;

import org.springframework.stereotype.Component;

@Component
public class TheMarina implements BattleGround {
    @Override
    public String getBattleGroundDesc() {
        return "While captain Nemo prepares for launch at the Marina A stranger approaches";
    }
}