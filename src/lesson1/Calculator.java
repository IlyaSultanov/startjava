package lesson1;

public class Calculator {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        long c = 1;
        String operator = "^";

        if (a <= 0 || b <= 0) {
            System.out.println("a и b должны быть целыми положительными числами");
        }

        if (operator.equals("+")) {
            System.out.println("a + b = " + (a + b));
        }

        if (operator.equals("*")) {
            System.out.println("a * b = " + (a * b));
        }

        if (operator.equals("-")) {
            System.out.println("a - b = " + (a - b));
        }

        if (operator.equals("/")) {
            System.out.println("a / b = " + (a / b));
        }

        if (operator.equals("^")) {
            for (int i = 0; i < b; i++) {
                c = c * a;
            }
            System.out.println("a ^ b = " + c);
        }

        if (operator.equals("%")) {
            System.out.println("a % b = " + (a % b));
        }
    }
}
