package com.startjava.Lesson3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String res;

        while (true) {
            System.out.println("Введите математическое выражение:");
            String a = scanner.nextLine();
            System.out.println(calculator.calculate(a));

            do {
                System.out.println("Хотите продолжить? (да/нет)");
                res = scanner.next();
                if (res.equals("нет")) {
                    System.out.println("Завершение программы");
                    return;
                }
            } while (!res.equals("да"));
        }
    }
}
