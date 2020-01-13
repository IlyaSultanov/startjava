package com.startjava.lesson2.calculator;

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
                Double c = Double.parseDouble(rawExpression[0]);
                Double d = Double.parseDouble(rawExpression[2]);
                Double rawResult = Math.pow(c, d);
                result = Integer.parseInt(rawResult.toString());
                break;
            case "%":
                result = a % b;
                break;
        }
        return result;
    }
}

