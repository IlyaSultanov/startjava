package lesson2;

import java.util.Scanner;

public class GuessNumber {

    private Scanner scanner = new Scanner(System.in);
    private int mystery = (int) ((Math.random() + 0.01) * 100);

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        boolean res = true;
        while (res) {
            guess(player1);
            guess(player2);
        }
    }

    private boolean guess(Player player) {
        System.out.println("Игрок " + player.getName() + ", введите число");
        player.setNumber(scanner.nextInt());
        return (compare(player, mystery));
    }

    private boolean compare(Player player, int model) {
        if (player.getNumber() > model) {
            System.out.println("Число слишком большое");
            return true;
        } else if (player.getNumber() < model) {
            System.out.println("Число слишком маленькое");
            return true;
        } else {
            System.out.println(player.getName() + ", вы угадали!");
            return false;
        }
    }
}