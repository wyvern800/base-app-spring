/*
package com.example.demo.databases;

import enums.Difficulties;
import enums.Locations;
import enums.SkillKeys;
import enums.Tiers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

*/
/* com.example.demo
 *
 * @author wyvern800 - http://github.com/wyvern800
 * @created 01/01/2021 - 23:17
 * @project demo*//*



@Component
public class CharacterDatabaseLoader implements CommandLineRunner {
    private final CharacterRepository characterRepository;

    @Autowired
    public CharacterDatabaseLoader(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public void run(String... args) {
        // Create the lists
        List<Weapon> weaponsList = new ArrayList<>();
        List<Skill> skillsList = new ArrayList<>();

        // Create the character
        Character theCharacter = new Character("Jackie", weaponsList, skillsList, null, "https://i.imgur.com/FxIJfdu.png", "https://i.imgur.com/F2n5GED.png", null, Tiers.A);

        // Create the weapon to the character
        Weapon dagger = new Weapon(theCharacter, "Dagger", Difficulties.NORMAL, 4, 1, 4, 1, 1, "https://i.imgur.com/RawUg8j.png", null, null);
        Weapon twohand = new Weapon(theCharacter, "Two-Handed Sword", Difficulties.NORMAL, 4, 1, 4, 1, 1, "https://i.imgur.com/qsToz4a.png", null, null);
        Weapon axe = new Weapon(theCharacter, "Axe", Difficulties.NORMAL, 4, 1, 4, 1, 1, "https://i.imgur.com/bRk1fqK.png", null, null);
        Weapon dualsword = new Weapon(theCharacter, "Dual Swords", Difficulties.NORMAL, 4, 1, 4, 1, 1, "https://i.imgur.com/74a8D1v.png", null, null);

        // Set the weapon skill
        WeaponSkill theWeaponSkill = new WeaponSkill(dagger, "Cloak and Dagger", 0, 40.0, "https://i.imgur.com/RawUg8j.png");
        dagger.setWeaponSkill(theWeaponSkill);

        WeaponSkill twoskill = new WeaponSkill(dagger, "Parry", 0, 40.0, "https://i.imgur.com/qsToz4a.png");
        twohand.setWeaponSkill(twoskill);

        WeaponSkill axeskill = new WeaponSkill(dagger, "Maleficent Hellx", 0, 40.0, "https://i.imgur.com/bRk1fqK.png");
        axe.setWeaponSkill(axeskill);

        WeaponSkill dualswordskill = new WeaponSkill(dagger, "Dual Sword Rampage", 0, 40.0, "https://i.imgur.com/74a8D1v.png");
        dualsword.setWeaponSkill(dualswordskill);

        // Set the stats
        theCharacter.setStats(new Stat(theCharacter, 560, 430 , 37, 26));

        // Create the skills
        Skill Q = new Skill(theCharacter, "Hack and Slash", 50, 10.0, SkillKeys.Q, "https://i.imgur.com/guE79Ui.png", "#");
        Skill W = new Skill(theCharacter, "Adrenaline Burst", 50, 10.0, SkillKeys.W, "https://i.imgur.com/838tol2.png", "#");
        Skill E = new Skill(theCharacter, "Leaping Strike", 50, 10.0, SkillKeys.E, "https://i.imgur.com/i1QvlqW.png", "#");
        Skill R = new Skill(theCharacter, "Chainsaw Murderer", 50, 10.0, SkillKeys.R, "https://i.imgur.com/5ANKYZW.png", "#");
        Skill PASSIVE = new Skill(theCharacter, "Bloodfeast", 50, 10.0, SkillKeys.PASSIVE, "https://i.imgur.com/SpIB4yO.png", "#");

        // Add the skills to the skills List
        skillsList.addAll(Arrays.asList(Q, W, E, R, PASSIVE));

        // Add the weapons to the weapons list
        weaponsList.addAll(Arrays.asList(dagger, twohand, axe, dualsword));

        Locations beco = Locations.BECO;
        Locations estande = Locations.BECO;
        Locations templo = Locations.TEMPLO;

        //Location location = new Location(beco.getName(),beco.getPos(), 13, 42, "Um lugar dharoka", null);
        //Location location2 = new Location(estande.getName(),estande.getPos(), 48, 39, "Um lugar dharoka", null);
        //Location location3 = new Location(templo.getName(),templo.getPos(), 27, 79, "Um lugar dharoka", null);

        List<Location> locsSet = new ArrayList<>();

        //locsSet.addAll(Arrays.asList(location, location3));

        Build theBuild = new Build("Crazy AP Jackie build", "Essa build é absurda e foca em AP", "1- Comece no meio do nada, faça isso, faça aquilo, etc etc, quando terminar mande um abraço para mim no twitter", null, dagger);

        Build theBuild2 = new Build("Spell power meta", "Uma build feita para dands", "Começe no hospital -> Pegue teleporte -> Praia -> Beco, é isso", null, dagger);

        Build theBuild3 = new Build("Crossing sword power", "Build para amassar players", "Nada a declarar", null, twohand);

        //location.setBuild(theBuild);
        //location2.setBuild(theBuild);

        List<Build> builds = new ArrayList<>(Arrays.asList(theBuild, theBuild2, theBuild3));

        dagger.setBuilds(builds);

        List<Character> firstChar = characterRepository.findAll();

        if (firstChar.size() <= 0) {
            this.characterRepository.save(theCharacter);
        }
    }
}
*/
