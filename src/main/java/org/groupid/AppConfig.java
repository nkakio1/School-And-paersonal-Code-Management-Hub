package org.groupid;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.groupid")
public class AppConfig {

    @Bean(name = "character1")
    public Character character1(@Qualifier("Nemobeam") FightingPower nemoBeam) {
        Character character = new Character();
        character.setName("THE Giant Squid");
        character.setHealth(100);
        character.setStrength(10);
        character.setFightingPower(nemoBeam);
        return character;
    }

    @Bean(name = "character2")
    public Character character2(@Qualifier("Twentyk") FightingPower twentyk) {
        Character character = new Character();
        character.setName("Captain Nemo");
        character.setHealth(100);
        character.setStrength(10);
        character.setFightingPower(twentyk);
        return character;
    }
}