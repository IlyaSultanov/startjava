package com.startjava.lesson2.game;

import java.util.Scanner;

public class GuessNumberTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = new Player(inputName(1), 10);
        Player player2 = new Player(inputName(2), 10);
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        do {
            guessNumber.start();
        } while (isContinue());
        System.out.println("Завершение программы");
    }

    private static String inputName(int number) {
        System.out.println("Введите имя " + number + " игрока:");
        return scanner.next();
    }

    private static boolean isContinue() {
        String playerAnswer;
        do {
            System.out.println("Хотите продолжить? (да/нет)");
            playerAnswer = scanner.next();
            if (playerAnswer.equals("да")) {
                return true;
            }
        } while (!playerAnswer.equals("нет"));
        return false;
    }
}
