package com.company;

public class Character {

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private boolean running = false;
    boolean arrested = false;

    public Character() { }

    public void attackCharacter(Character enemy) {
        boolean blocksAttack;

        if(this.isArrested()) {
            throw new IllegalAccessError("You are arrested, you cannot attack an enemy!");
        }

        if (enemy.getAttackPower() == 10) {
            blocksAttack = Math.floor(Math.random() * 100) > 50 ? true : false;
            Warrior warrior = (Warrior) enemy;

            if (blocksAttack) {
                warrior.setShieldStrength(warrior.getShieldStrength() - this.getAttackPower());
            } else warrior.setHealth(warrior.getHealth() - this.getAttackPower());

        } else {
            int remainingHealth = enemy.getHealth() - this.getAttackPower();
            enemy.setHealth(remainingHealth);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isArrested() {
        return arrested;
    }
}
