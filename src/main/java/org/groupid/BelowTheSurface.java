package org.groupid;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BelowTheSurface implements BattleGround {
    @Override
    public String getBattleGroundDesc() {
        return "As the Submarine, which now felt more like a metal tomb, continued to descend";
    }
}