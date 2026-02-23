package org.groupid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
        System.out.print(battleground.getBattleGroundDesc() + ", ");
        System.out.println(character1.getName() + " and " + character2.getName() + " Begin to fight.");
        character1.useFightingPower();
        character2.useFightingPower();
    }
}