package com.example.harkkatyo;

import java.io.Serializable;

public class Lutemon implements Serializable {
    protected String name;
    protected int attack;
    protected int defence;
    protected int experience;
    protected int health;
    protected int maxHealth;
    protected  int image;


    protected String lutemonColor;


    public Lutemon(String name, String lutemonColor, int attack, int defence, int experience, int health, int maxHealth) {
        this.name = name;
        this.lutemonColor = lutemonColor;
        this.attack = attack;
        this.defence = defence;
        this.experience = experience;
        this.health = health;
        this.maxHealth = maxHealth;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return lutemonColor;
    }


    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getExperience() {
        return experience;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getImage() {
        return image;
    }
}
