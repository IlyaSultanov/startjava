public class GuessNumberTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = new Player(inputName(1));
        Player player2 = new Player(inputName(2));
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
        }
        while (!playerAnswer.equals("нет"));
        return false;
    }
}
