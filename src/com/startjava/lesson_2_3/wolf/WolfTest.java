package com.startjava.lesson_2_3.wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("male");
        wolf.setName("Oskar");
        wolf.setWeight(21);
        wolf.setAge(5);
        wolf.setColour("Grey");

        System.out.println(wolf.getName() + wolf.getSex() + " " + wolf.getWeight() + " " + wolf.getAge() + " " + wolf.getColour());

        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunting();
    }
}