package org.groupid;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {
     public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/Beans.xml");
        Battle battle = context.getBean(Battle.class);
        battle.fight();
        context.close();
    }
}