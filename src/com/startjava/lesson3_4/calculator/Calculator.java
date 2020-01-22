package com.startjava.lesson3_4.calculator;

public class Calculator {

    public int calculate(String expression) {
        int result = 0;
        String[] rawExpression = expression.split(" ");
        int a = Integer.parseInt(rawExpression[0]);
        String operator = rawExpression[1];
        int b = Integer.parseInt(rawExpression[2]);
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
                result = Math.floorDiv(a, b);
                break;
            case "^":
                double c = Double.parseDouble(rawExpression[0]);
                double d = Double.parseDouble(rawExpression[2]);
                double rawResult = Math.pow(c, d);
                result = Integer.parseInt(String.valueOf(rawResult));
                break;
            case "%":
                result = a % b;
                break;
        }
        return result;
    }
}

