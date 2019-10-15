package lesson1;

public class Cycle {

    public static void main(String[] args) {

        for (int i = 1; i < 21; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 6;
        while (i > -8) {
            System.out.print(i + " ");
            i = i - 2;
        }
        System.out.println();

        int j = 10;
        do {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
            j = j + 1;
        } while (j < 20);
    }
}
