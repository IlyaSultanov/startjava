public class GuessNumber {

    private Scanner scanner = new Scanner(System.in);


    private Player player1;
    private Player player2;
    private boolean isPlayerGuess;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int mysteryNumber = (int) (Math.random() * 101);
        while (true) {
            inputNumber(player1);
            compare(player1, mysteryNumber);
            if (!isPlayerGuess) {
                return;
            }
            inputNumber(player2);
            compare(player2, mysteryNumber);
            if (!isPlayerGuess) {
                return;
            }
        }
    }

    private void inputNumber(Player player) {
        System.out.println("Игрок " + player.getName() + ", введите число");
        player.setNumber(scanner.nextInt());
    }

    private void compare(Player player, int mysteryNumber) {
        if (player.getNumber() > mysteryNumber) {
            System.out.println("Число слишком большое");
            isPlayerGuess = true;
        } else if (player.getNumber() < mysteryNumber) {
            System.out.println("Число слишком маленькое");
            isPlayerGuess = true;
        } else {
            System.out.println(player.getName() + ", вы угадали!");
            isPlayerGuess = false;
        }
    }
}