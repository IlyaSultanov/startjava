public class GuessNumber {

    private static Scanner scanner = new Scanner(System.in);
    private static int mystery = (int) (Math.random() * 100);

    public static void start() {
        Player player1 = new Player(naming(1));
        Player player2 = new Player(naming(2));
        while (true) {
            guess(player1.getName());
            guess(player2.getName());
        }
    }

    private static String naming(int number) {
        System.out.println("Введите имя " + number + " игрока:");
        return scanner.next();
    }

    private static void guess(String name) {
        System.out.println("Игрок " + name + ", введите число");
        int pl1 = scanner.nextInt();
        if (!check(pl1)) {
            compare(pl1, mystery);
        } else {
            System.out.println(name + ", вы угадали!");
            continueAsk();
        }
    }

    private static boolean check(int num) {
        return num == mystery;
    }

    private static void compare(int num, int model) {
        if (num > model) {
            System.out.println("Число слишком большое");
        } else {
            System.out.println("Число слишком маленькое");
        }
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
    }
}