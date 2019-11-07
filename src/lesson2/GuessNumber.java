import java.util.Scanner;

public class GuessNumber {

    private static Scanner scanner = new Scanner(System.in);
    private final int mystery = (int) (Math.random() * 100);

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

    public void common(String name) {
        System.out.println("Игрок " + name + ", введите число");
        int pl1 = scanner.nextInt();
        if (!check(pl1)) {
            compare(pl1, getMystery());
        } else {
            System.out.println(name + ", вы угадали!");
            doYouWantToContinue();
        }
    }

    public String naming(int number) {
        System.out.println("Введите имя " + number + " игрока:");
        return scanner.next();
    }
}
