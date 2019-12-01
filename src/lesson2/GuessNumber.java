public class GuessNumber {

    private Scanner scanner = new Scanner(System.in);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int mysteryNumber = (int) (Math.random() * 101);
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
        System.out.println("Игрок " + player.getName() + ", введите число");
        player.setNumber(scanner.nextInt());
        if (player.getNumber() > mysteryNumber) {
            System.out.println("Число слишком большое");
            return false;
        } else if (player.getNumber() < mysteryNumber) {
            System.out.println("Число слишком маленькое");
            return false;
        } else {
            System.out.println(player.getName() + ", вы угадали!");
            return true;
        }
    }
}