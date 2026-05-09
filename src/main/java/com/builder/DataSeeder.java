package com.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.builder.model.Character;
import com.builder.model.Skill;
import com.builder.model.Weapon;
import com.builder.repository.CharacterRepository;

@Component
public class DataSeeder implements CommandLineRunner{

    private final CharacterRepository characterRepository;

    public DataSeeder(CharacterRepository characterRepository) {
    this.characterRepository = characterRepository;
}
    @Override
    public void run (String...args) throws Exception {
        System.out.println("DataSeeder ejecutándose...");

        Weapon thornBlade = new Weapon(); 
        thornBlade.setName("Thorn Blade");
        thornBlade.setDamage(25);
        
        List<Skill> skills = new ArrayList<>(); 
        Skill slash = new Skill(); 
        slash.setName("Thorn Slash"); 
        slash.setPower(15);
        slash.setDescription("Three thorns are shoot in direction of its enemy");
        skills.add(slash); 

        Character fyoren = new Character();
        fyoren.setName("Fyoren");
        fyoren.setLevel(1);
        fyoren.setHp(100);
        fyoren.setAttack(15);
        fyoren.setDefense(5);
        fyoren.setSpeed(20);
        fyoren.setStyle("Mage");

        fyoren.setWeapon(thornBlade);
        fyoren.setSkills(skills);

        if (characterRepository.count() == 0) {
            characterRepository.save(fyoren);
            System.out.println("Character saved: " + fyoren.getName());
        } else {
            System.out.println("Data already seeded, skipping.");
        }
    }
}
