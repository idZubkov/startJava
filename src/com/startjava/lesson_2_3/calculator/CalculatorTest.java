package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String word;
        String input;
        do {
            System.out.println("Введите математическое выражение: ");
            input = scanner.nextLine();
            calculator.calculate(input);
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                word = scanner.nextLine();
            } while (!(word.equals("Да") || word.equals("Нет")));
        } while (word.equals("Да"));
    }
}