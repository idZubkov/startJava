package com.startjava.lesson_2_3.guessnumber;

public class Player {
    private String name;
    private int number;
    private int input;

    public Player(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}