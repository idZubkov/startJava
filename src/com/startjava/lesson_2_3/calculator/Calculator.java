package com.startjava.lesson_2_3.calculator;

public class Calculator {

    public void calculate(String input) {
        String[] arr = input.split(" ");
        int val1 = Integer.parseInt(arr[0]);
        int val2 = Integer.parseInt(arr[2]);
        int answer = 0;
        String sign = arr[1];
        switch (sign) {
            case "+":
                answer = val1 + val2;
                break;
            case "-":
                answer = Math.subtractExact(val1, val2);
                break;
            case "*":
                answer = Math.multiplyExact(val1, val2);
                break;
            case "/":
                answer = val1 / val2;
                break;
            case "^":
                answer = (int) Math.pow(val1, val2);
                break;
            case "%":
                answer = val1 % val2;
                break;
        }
        System.out.println(answer);
    }
}