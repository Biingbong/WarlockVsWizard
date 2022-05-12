package com.company;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n=====================================================================================\n                                 Wizards and Warlocks\n=====================================================================================\n");

        Wizard Merlin = new Wizard("Merlin", 0, 100, 200);
        Warlock Saruman = new Warlock("Saruman", 0, 100, 200);
        Character A = new Character();

        A.displayname(Merlin.characterName);
        A.displayname(Saruman.characterName);
        A.Intro();
        Merlin.scriptMagic(Saruman);
        Saruman.blackLight(Merlin);
        Merlin.fireStorm(Saruman);
        Saruman.demonsGift();
        Merlin.luminus(Saruman);
        Saruman.bloodMoon(Merlin);
        Merlin.healingRay();
        Saruman.healingShadow();
        Merlin.gigaFlare(Saruman);
        Saruman.bloodMoon(Merlin);
        Merlin.scriptMagic(Saruman);
    }
}