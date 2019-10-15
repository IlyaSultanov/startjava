package lesson1;

public class MyFirstGame {

    public static void main(String[] args) {

        int mystery = 50;
        int key = 17;

        if (mystery < 0 || mystery > 100 || key < 0 || key > 100) {
            System.out.println("числа должны быть от 0 до 100");
        }

        while (key != mystery) {
            if (key > mystery) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                key = key - 1;
            } else {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                key = key + 1;
            }
        }

        System.out.println("Вы угадали! " + mystery);
    }
}
