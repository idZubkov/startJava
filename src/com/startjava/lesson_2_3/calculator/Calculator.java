package com.startjava.lesson2.calculator;

public class Calculator {
    private int value1;
    private int value2;
    private char sign;

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
        switch (sign) {
            case '+':
                System.out.println(value1 + value2);
                break;
            case '-':
                System.out.println(value1 - value2);
                break;
            case '*':
                System.out.println(value1 * value2);
                break;
            case '/':
                System.out.println(value1 / value2);
                break;
            case '^':
                int power = 1;
                for (int i = 0; i < value2; i++) {
                    power *= value1;
                }
                System.out.println(power);
                break;
            case '%':
                System.out.println(value1 % value2);
                break;
        }
    }
}