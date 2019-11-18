public class GuessNumber {

    private Scanner scanner = new Scanner(System.in);

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int mystery = (int) ((Math.random() + 0.01) * 100);
        while (true) {
            guess(player1);
            if (compare(player1, mystery)) {
                System.out.println(player1.getName() + ", вы угадали!");
                return;
            }
            guess(player2);
            if (compare(player2, mystery)) {
                System.out.println(player2.getName() + ", вы угадали!");
                return;
            }
        }
    }

    private void guess(Player player) {
        System.out.println("Игрок " + player.getName() + ", введите число");
        player.setNumber(scanner.nextInt());
    }

    private boolean compare(Player player, int model) {
        if (player.getNumber() > model) {
            System.out.println("Число слишком большое");
            return false;
        } else if (player.getNumber() < model) {
            System.out.println("Число слишком маленькое");
            return false;
        } else {
            return true;
        }
    }
}