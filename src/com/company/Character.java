package com.company;

    public class Character {
        public String characterName = "Gandalf";
        public int level = 0;
        public int healthPoints = 100;
        public int manaPoints = 200;

        /**
         * Created Character constructor so that Intro and displayname can be accessed
         */
        public Character() {

        }
        /**
         * None parameterized constructor
         */
        public void Intro(){
            System.out.println("\n=====================================================================================\n                                       FIGHT!!\n=====================================================================================\n");
        }
        /**
         * Parameterized constructor
         */
        Character(String name, int lvl, int hp, int mp){
            characterName = name;
            level = lvl;
            healthPoints = hp;
            manaPoints = mp;
        }
        /**
         * Display the names of the characters
         */
        public static void displayname(String characterName){
            System.out.println("                            Character Initialized: "+characterName);
        }

        /**
         * It applies the damage to the enemy character from the ally character
         */
        public void damageTarget(Character enemyCharacter, int damagePoints){
            /**
             * Deduct health points from enemy character
             */
            enemyCharacter.healthPoints -= damagePoints;
            System.out.println(enemyCharacter.characterName + "\nHealth Points: "+ enemyCharacter.healthPoints + "\nMana Points: "+ enemyCharacter.manaPoints);
            System.out.println(characterName + "\nHealth Points: "+ healthPoints + "\nMana Points: "+ manaPoints);
            System.out.println("enemy character " + enemyCharacter.characterName+" HP Left = " + enemyCharacter.healthPoints+ "\n=====================================================================================");

            /**
             * To prompt that a character is defeated if HP falls below 0
             * then levels up the ally character
             * then ends the program
             */
            if (enemyCharacter.healthPoints <= 0){
                System.out.println("Character "+enemyCharacter.characterName+" is defeated!");
                level += 10;
                    System.out.println("Character " + characterName + " leveled up to " + level+"!");
                    System.exit(0);
            }
        }
    }

