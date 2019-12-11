package com.startjava.lesson2.calculator;

public class Calculator {

    public int calculate(int a, String operator, int b) {
        int result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "^":
                int c = 1;
                for (int i = 0; i < b; i++) {
                    c *= a;
                }
                result = c;
                break;
            case "%":
                result = a % b;
                break;
        }
        return result;
    }
}

