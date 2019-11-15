public class GuessNumber {

    private static Scanner scanner = new Scanner(System.in);
    private static int mystery = (int) (Math.random() * 100);

    public void start(Player player1, Player player2) {
        while (true) {
            guess(player1);
            guess(player2);
        }
    }

    private void guess(Player player) {
        System.out.println("Игрок " + player.getName() + ", введите число");
        player.setNumber(scanner.nextInt());
        if (!check(player.getNumber())) {
            compare(player.getNumber(), mystery);
        } else {
            System.out.println(player.getName() + ", вы угадали!");
            continueAsk();
        }
    }

    private boolean check(int num) {
        return num == mystery;
    }

    private void compare(int num, int model) {
        if (num > model) {
            System.out.println("Число слишком большое");
        } else {
            System.out.println("Число слишком маленькое");
        }
    }

    private void continueAsk() {
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