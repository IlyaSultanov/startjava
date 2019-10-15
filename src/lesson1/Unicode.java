package lesson1;

public class Unicode {

    public static void main(String[] args) {

        for (int i = 9398; i < 10179; i++) {
            System.out.println(Character.toChars(i));
        }

        for (int i = 33; i < 127; i++) {
            System.out.println(Character.toChars(i));
        }
    }
}
