package com.company;

public class Warlock extends Character{
    Warlock(String name,int lvl, int hp, int mp){
        super(name, lvl, hp, mp);
    }

    /**
     * A skill that can damage enemy character
     */
    public void blackLight(Character enemyCharacter){
        System.out.println("=====================================================================================\n"+super.characterName + " attacks " + enemyCharacter.characterName + " with blackLight! (Damage - 50; Mana Cost - 40)");
        int damagePoints = 50;
        super.manaPoints -= 40;
        damageTarget(enemyCharacter, damagePoints);
    };
    /**
     * skills that can heal ally character
     */
    public void healingShadow(){
        System.out.println("=====================================================================================\n"+super.characterName + " heals itself using healingShadow! (Health Recovered - 65; Mana Recovered - 5)");
        super.healthPoints += 65;
        super.manaPoints += 5;
        System.out.println(super.characterName + "\nHealth Points: "+ super.healthPoints + "\nMana Points: "+ super.manaPoints);
    };
    public void demonsGift(){
        System.out.println("=====================================================================================\n"+super.characterName + " heals itself using demonsGift! (Health Recovered - 2x; Mana Recovered - 10)");
        super.healthPoints += super.healthPoints;
        super.manaPoints += 10;
        System.out.println(super.characterName + "\nHealth Points: "+ super.healthPoints + "\nMana Points: "+ super.manaPoints);
    };
    /**
     * a skill that can do both damage enemy character and heal ally character
     */
    public void bloodMoon(Character enemyCharacter){
        System.out.println("=====================================================================================\n"+super.characterName + " attacks " + enemyCharacter.characterName + " with bloodMoon and heals itself! (Damage - 25; Mana Cost - 10; Recovered - 5)");
        int damagePoints = 25;
        super.healthPoints += 5;
        super.manaPoints -= 10;
        damageTarget(enemyCharacter, damagePoints);
    };
}
