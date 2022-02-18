package com.company;

public class GameApp {

    public static void main(String[] args) {
//        Instantiate character objects
        Farmer farmer = new Farmer("MacDonald");
        Warrior warrior = new Warrior("Askia");
        Constable constable = new Constable("Marshall Willenholly");

//        Warrior attacks farmer
        warrior.attackCharacter(farmer);
        System.out.printf("Farmer's health: %d", farmer.getHealth());

        System.out.println("\n");

//        Farmer attacks warrior
        farmer.attackCharacter(warrior);
        System.out.printf("Warrior's health: %d", warrior.getHealth());

        System.out.println("\n");

//        Warrior attacks farmer again
        warrior.attackCharacter(farmer);
        System.out.printf("Farmer's health: %d", farmer.getHealth());

        System.out.println("\n");

        //    Constable attacks & arrests warrior
        constable.attackCharacter(warrior);
        constable.arrestCriminal(warrior);
        System.out.printf("Warrior's health: %d", warrior.getHealth());
        System.out.println("\n");
        System.out.printf("Warrior is arrested?: %s", warrior.isArrested());
    }
}
