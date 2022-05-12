package com.company;

public class Wizard extends Character{
    Wizard(String name,int lvl, int hp, int mp){
        super(name, lvl, hp, mp);
    }
    /**
     * Skills that can damage enemy character
     */
    public void fireStorm(Character enemyCharacter){
        System.out.println("=====================================================================================\n"+super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm! (Damage - 50; Mana Cost - 40)");
        int damagePoints = 50;
        super.manaPoints -= 40;
        damageTarget(enemyCharacter, damagePoints);
    };
    public void scriptMagic(Character enemyCharacter){
        System.out.println("=====================================================================================\n"+super.characterName + " attacks " + enemyCharacter.characterName + " with scriptMagic! (Damage - 30; Mana Cost - 25)");
        int damagePoints = 30;
        super.manaPoints -= 25;
        damageTarget(enemyCharacter, damagePoints);
    };
    public void luminus(Character enemyCharacter){
        System.out.println("=====================================================================================\n"+super.characterName + " attacks " + enemyCharacter.characterName + " with luminus! (Damage - 10; Mana Cost - 5)");
        int damagePoints = 10;
        super.manaPoints -= 5;
        damageTarget(enemyCharacter, damagePoints);
    };
    public void gigaFlare(Character enemyCharacter){
        System.out.println("=====================================================================================\n"+super.characterName + " attacks " + enemyCharacter.characterName + " with gigaFlare! (Damage - 75; Mana Cost - 100)");
        int damagePoints = 75;
        super.manaPoints -= 100;
        damageTarget(enemyCharacter, damagePoints);
    };
    /**
     * A skill that can heal ally character
     */
    public void healingRay(){
        System.out.println("=====================================================================================\n"+super.characterName + " heals itself using healingRay! (health - 15; Mana Recovered - 30)");
        super.healthPoints += 15;
        super.manaPoints += 30;
        System.out.println(super.characterName + "\nHealth Points: "+ super.healthPoints + "\nMana Points: "+ super.manaPoints);
    };
}
