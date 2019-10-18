public class MyFirstGame {

    public static void main(String[] args) {
        int mystery = 50;
        int humansNumber = 17;

        if (mystery < 0 || mystery > 100 || humansNumber < 0 || humansNumber > 100) {
            System.out.println("числа должны быть от 0 до 100");
        }

        while (humansNumber != mystery) {
            if (humansNumber > mystery) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                humansNumber--;
            } else {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                humansNumber++;
            }
        }
        System.out.println("Вы угадали! " + mystery);
    }
}
