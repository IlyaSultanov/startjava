package com.startjava.lesson3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String playerAnswer;

        while (true) {
            System.out.println("Введите математическое выражение:");
            String mathExpression = scanner.nextLine();
            System.out.println(calculator.calculate(mathExpression));

            do {
                System.out.println("Хотите продолжить? (да/нет)");
                playerAnswer = scanner.next();
                if (playerAnswer.equals("нет")) {
                    System.out.println("Завершение программы");
                    return;
                }
            } while (!playerAnswer.equals("да"));
        }
    }
}
