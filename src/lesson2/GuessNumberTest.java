import java.util.Scanner;

public class GuessNumberTest {

    private static Scanner scanner = new Scanner(System.in);
    private static GuessNumber guessNumber = new GuessNumber();

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        System.out.println("Введите имя первого игрока:");
        player1.setName(scanner.next());
        System.out.println("Введите имя второго игрока:");
        player2.setName(scanner.next());

        while (true) {
            common(player1);
            common(player2);
        }
    }

    private static void compare(int num, int model) {
        if (num > model) {
            System.out.println("Число слишком большое");
        } else {
            System.out.println("Число слишком маленькое");
        }
    }

    private static void doYouWantToContinue() {
        String res;
        do {
            System.out.println("Хотите продолжить? (да/нет)");
            res = scanner.next();
            if (res.equals("нет")) {
                System.out.println("Завершение программы");
                System.exit(0);
            }
        } while (!res.equals("да"));
    }

    private static void common(Player player) {
        System.out.println("Игрок " + player.getName() + ", введите число");
        int pl1 = scanner.nextInt();
        if (!guessNumber.check(pl1)) {
            compare(pl1, guessNumber.getMystery());
        } else {
            System.out.println(player.getName() + ", вы угадали!");
            doYouWantToContinue();
        }
    }
}
