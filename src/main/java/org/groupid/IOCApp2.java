package org.groupid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class IOCApp2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Battle battle = context.getBean(Battle.class);
        Map<String, BattleGround> bgMap = context.getBeansOfType(BattleGround.class);
        List<BattleGround> allGrounds = new ArrayList<>(bgMap.values());
        Random random = new Random();
        BattleGround randomGround = allGrounds.get(random.nextInt(allGrounds.size()));
        battle.setBattleground(randomGround);
        battle.fight();
        context.close();
    }
}