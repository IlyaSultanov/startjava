public class Calculator {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        String operator = "-";

        if (a <= 0 || b <= 0) {
            System.out.println("a и b должны быть целыми положительными числами");
        } else if (operator.equals("+")) {
            System.out.println("a + b = " + (a + b));
        } else if (operator.equals("*")) {
            System.out.println("a * b = " + (a * b));
        } else if (operator.equals("-")) {
            System.out.println("a - b = " + (a - b));
        } else if (operator.equals("/")) {
            System.out.println("a / b = " + (a / b));
        } else if (operator.equals("^")) {
            long c = 1;
            for (int i = 0; i < b; i++) {
                c *= a;
            }
            System.out.println("a ^ b = " + c);
        } else if (operator.equals("%")) {
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("Оператор задан неверно");
        }
    }
}