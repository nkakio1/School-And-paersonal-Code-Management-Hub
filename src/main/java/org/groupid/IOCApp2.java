package org.groupid;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class IOCApp2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
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