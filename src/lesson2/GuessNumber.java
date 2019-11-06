import java.util.Scanner;

public class GuessNumber {

    private static Scanner scanner = new Scanner(System.in);
    private static GuessNumber guessNumber = new GuessNumber();

    private int mystery = (int) (Math.random() * 100);

    public int getMystery() {
        return mystery;
    }

    public boolean check(int num) {
        return num == mystery;
    }

    private static void compare(int num, int model) {
        if (num > model) {
            System.out.println("Число слишком большое");
        } else {
            System.out.println("Число слишком маленькое");
        }
    }

    private void doYouWantToContinue() {
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

    public void common(Player player) {
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
