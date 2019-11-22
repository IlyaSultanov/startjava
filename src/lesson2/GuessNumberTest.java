public class GuessNumberTest {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean indicator = true;

    public static void main(String[] args) {
        Player player1 = new Player(inputName(1));
        Player player2 = new Player(inputName(2));
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        do {
            guessNumber.start();
            continueAsk();
        } while (indicator);
        System.out.println("Завершение программы");
    }

    private static String inputName(int number) {
        System.out.println("Введите имя " + number + " игрока:");
        return scanner.next();
    }

    private static void continueAsk() {
        String playerAnswer;
        do {
            System.out.println("Хотите продолжить? (да/нет)");
            playerAnswer = scanner.next();
            if (playerAnswer.equals("нет")) {
                indicator = false;
            }
        }
        while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
    }
}
