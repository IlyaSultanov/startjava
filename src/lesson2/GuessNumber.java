public class GuessNumber {

    private Scanner scanner = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int mysteryNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        mysteryNumber = (int) (Math.random() * 101);
        while (true) {
            if (makeMove(player1, mysteryNumber)) {
                return;
            }
            if (makeMove(player2, mysteryNumber)) {
                return;
            }
        }
    }

    private boolean makeMove(Player player, int mysteryNumber) {
        inputNumber(player);
        if (player.getNumber() > mysteryNumber) {
            System.out.println("Число слишком большое");
        } else if (player.getNumber() < mysteryNumber) {
            System.out.println("Число слишком маленькое");
        } else {
            System.out.println(player.getName() + ", вы угадали!");
            return true;
        }
        return false;
    }

    private void inputNumber(Player player) {
        System.out.println("Игрок " + player.getName() + ", введите число");
        player.setNumber(scanner.nextInt());
    }
}