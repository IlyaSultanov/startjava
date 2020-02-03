package com.startjava.lesson3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private Scanner scanner = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int mysteryNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        mysteryNumber = (int) (Math.random() * 101);
        init();
        while (true) {
            if (isBothTryEnd(player1, player2)) {
                printPlayerAttempts(player1);
                printPlayerAttempts(player2);
                return;
            }
            if (makeMove(player1)) {
                printPlayerAttempts(player1);
                printPlayerAttempts(player2);
                return;
            }
            if (makeMove(player2)) {
                printPlayerAttempts(player1);
                printPlayerAttempts(player2);
                return;
            }
        }
    }

    private void printPlayerAttempts(Player player) {
        System.out.print("Варианты, предложенные " + player.getName() + ": ");
        int[] enteredNumbers = Arrays.copyOf(player.getEnteredNumbers(), player.getArrayCapacity() - player.getCountOfTry());
        for (int i = 0; i < enteredNumbers.length; i++) {
            System.out.print(enteredNumbers[i] + " ");
        }
        System.out.println();
    }

    private void init() {
        Arrays.fill(player1.getEnteredNumbers(), 0, player1.getArrayCapacity() - player1.getCountOfTry(), -1);
        player1.setCountOfTry(10);
        Arrays.fill(player2.getEnteredNumbers(), 0, player2.getArrayCapacity() - player2.getCountOfTry(), -1);
        player2.setCountOfTry(10);
    }

    private boolean isBothTryEnd(Player player1, Player player2) {
        return player1.getCountOfTry() <= 0 || player2.getCountOfTry() <= 0;
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        return compare(player);
    }

    private void inputNumber(Player player) {
        if (player.getCountOfTry() > 0) {
            System.out.println("Игрок " + player.getName() + ", у вас осталось " + player.getCountOfTry() + " попыток, введите число");
            player.setNumber(scanner.nextInt());
            player.setEnteredNumber(player.getNumber());
            player.setCountOfTry(player.getCountOfTry() - 1);
        } else {
            player.setNumber(-1);
            System.out.println("Игрок " + player.getName() + ", у вас кончились попытки");
        }

    }

    private boolean compare(Player player) {
        if (player.getNumber() > mysteryNumber) {
            System.out.println("Число слишком большое");
        } else if (player.getNumber() < mysteryNumber) {
            System.out.println("Число слишком маленькое");
        } else {
            System.out.println(player.getName() + ", вы угадали!");
            return true;
        }
        return false;
    }

}