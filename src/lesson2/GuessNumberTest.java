package lesson2;

import java.util.Scanner;

public class GuessNumberTest {

    private static Scanner scanner = new Scanner(System.in);
    private static Player player1 = new Player(inputName(1));
    private static Player player2 = new Player(inputName(2));
    private static GuessNumber guessNumber = new GuessNumber(player1, player2);

    public static void main(String[] args) {
        guessNumber.start();
        continueAsk();
    }

    private static String inputName(int number) {
        System.out.println("Введите имя " + number + " игрока:");
        return scanner.next();
    }

    private static void continueAsk() {
        String res;
        do {
            System.out.println("Хотите продолжить? (да/нет)");
            res = scanner.next();
            if (res.equals("нет")) {
                System.out.println("Завершение программы");
                System.exit(0);
            }
        } while (!res.equals("да"));
        guessNumber.start();
    }
}
