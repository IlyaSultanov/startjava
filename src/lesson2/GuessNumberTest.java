public class GuessNumberTest {

    public static void main(String[] args) {
        Player player1 = new Player(naming(1));
        Player player2 = new Player(naming(2));
        GuessNumber.start(player1, player2);
    }
}
