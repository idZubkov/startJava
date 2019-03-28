package com.startjava.lesson1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 3;
        char sign = '^';

        if (sign == '+') {
            System.out.println(value1 + value2);
        } else if (sign == '-') {
            System.out.println(value1 - value2);
        } else if (sign == '*') {
            System.out.println(value1 * value2);
        } else if (sign == '/') {
            System.out.println(value1 / value2);
        } else if (sign == '^') {
            int power = 1;
            for (int i = 0; i < value2; i++) {
                power *= value1;
            }
            System.out.println(power);
        } else if (sign == '%') {
            System.out.println(value1 % value2);
        }
    }
}