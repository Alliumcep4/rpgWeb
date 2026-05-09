package com.builder.model;

public class Weapon {
    private String name; 
    private int damage; 
    private String Type; 
    private String bonusStat;
    
    public Weapon() {
    }

    public Weapon(String name, int damage, String type, String bonusStat) {
        this.name = name;
        this.damage = damage;
        Type = type;
        this.bonusStat = bonusStat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getBonusStat() {
        return bonusStat;
    }

    public void setBonusStat(String bonusStat) {
        this.bonusStat = bonusStat;
    } 

    
    
}
