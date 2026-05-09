package com.builder.model;

public class Skill {
    private String name; 
    private String description; 
    private int cooldown; 
    private int power;
    
    public Skill() {
    }

    public Skill(String name, String description, int cooldown, int power) {
        this.name = name;
        this.description = description;
        this.cooldown = cooldown;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    
}
