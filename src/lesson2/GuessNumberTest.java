public class GuessNumberTest {

    private static GuessNumber guessNumber = new GuessNumber();

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        player1.setName(guessNumber.naming(1));
        player2.setName(guessNumber.naming(2));

        while (true) {
            guessNumber.common(player1.getName());
            guessNumber.common(player2.getName());
        }
    }


}
