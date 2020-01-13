package com.startjava.lesson2.game;

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
        reNew(player1, player2);
        while (true) {
            if (isBothTryEnd(player1, player2)) {
                printBothSides(player1, player2);
                return;
            }
            if (makeMove(player1)) {
                printBothSides(player1, player2);
                return;
            }
            if (makeMove(player2)) {
                printBothSides(player1, player2);
                return;
            }
        }
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
        }

    }

    private boolean compare(Player player) {
        if (player.getNumber() > mysteryNumber) {
            System.out.println("Число слишком большое");
            isTryEnd(player);
        } else if (player.getNumber() < mysteryNumber) {
            System.out.println("Число слишком маленькое");
            isTryEnd(player);
        } else {
            System.out.println(player.getName() + ", вы угадали!");
            return true;
        }
        return false;
    }

    private boolean isBothTryEnd(Player player1, Player player2) {
        return player1.getCountOfTry() <= 0 || player2.getCountOfTry() <= 0;
    }

    private void isTryEnd(Player player) {
        if (player.getCountOfTry() < 1) {
            System.out.println("Игрок " + player.getName() + ", у вас кончились попытки");
            player.setNumber(-1);
        }
    }

    private void printBothSides(Player player1, Player player2) {
        System.out.print("Варианты, предложенные " + player1.getName() + ": ");
        for (int i = 0; i < player1.getEnteredNumber().length; i++) {
            System.out.print(player1.getEnteredNumber()[i] + " ");
        }
        System.out.println();
        System.out.print("Варианты, предложенные " + player2.getName() + ": ");
        for (int i = 0; i < player2.getEnteredNumber().length; i++) {
            System.out.print(player2.getEnteredNumber()[i] + " ");
        }
        System.out.println();
    }

    private void reNew(Player player1, Player player2) {
        player1.setCountOfTry(10);
        player2.setCountOfTry(10);
        player1.setNullArray();
        player2.setNullArray();
    }
}