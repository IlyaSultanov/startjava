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
            guessNumber.common(player1);
            guessNumber.common(player2);
        }
    }


}
