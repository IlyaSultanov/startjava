public class GuessNumberTest {

    public static void main(String[] args) {
        Player player1 = new Player(naming(1));
        Player player2 = new Player(naming(2));

        GuessNumber guessNumber = new GuessNumber();
        guessNumber.start(player1, player2);
    }

    private static String naming(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя " + number + " игрока:");
        return scanner.next();
    }
}
