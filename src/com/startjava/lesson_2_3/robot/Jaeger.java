package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;
    private String weapon;
    private int kaijuKilled;

    public void move() {
        System.out.println("Go");
    }

    public void fight() {
        System.out.println("Сражается");
    }

    public boolean drift() {
        System.out.println("Вошёл в дрифт");
        return false;
    }

    public String scanKaiju() {
        System.out.println("Сканирует кайдзю");
        return "Сканирует кайдзю";
    }

    public void useVortexCannon() {
        System.out.println("Use вихревую пушку");
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getOrigin() {
        return origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }
     public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getStrength() {
        return strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    public int getArmor() {
        return armor;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public String getWeapon() {
        return weapon;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }
    public int getKaijuKilled() {
        return kaijuKilled;
    }
}