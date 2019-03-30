package com.startjava.lesson2.wolf;

public class Wolf {
    private String sex;
    private String name;
    private int weight;
    private int age;
    private String colour;

    public void move() {
        System.out.println("Go");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public boolean run() {
        System.out.println("Бежит");
        return true;
    }

    public void howl() {
        System.out.println("Воет");
    }
    
    public void hunting() {
        System.out.println("Охотится");
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        }
        this.age = age;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }
}