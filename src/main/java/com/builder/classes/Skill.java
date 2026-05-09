package com.builder.classes;

public class Skill {
    private String description; 
    private int cooldown; 
    private int power;
    
    public Skill() {
    }

    public Skill(String description, int cooldown, int power) {
        this.description = description;
        this.cooldown = cooldown;
        this.power = power;
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
