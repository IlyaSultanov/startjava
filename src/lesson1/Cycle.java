public class Cycle {

    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 6;
        while (i >= -6) {
            System.out.print(i + " ");
            i -= 2;
        }
        System.out.println();

        int j = 10;
        int summ = 0;
        do {
            if (j % 2 != 0) {
                summ += j;
            }
            j++;
        } while (j < 20);
        System.out.println(summ);
    }
}
