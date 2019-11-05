import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String res;

        while (true) {
            System.out.println("Введите первое число:");
            int a = scanner.nextInt();
            System.out.println("Введите знак математической операции:");
            String operator = scanner.next();
            System.out.println("Введите второе число:");
            int b = scanner.nextInt();

            System.out.println(calculator.calculate(a, operator, b));

            do {
                System.out.println("Хотите продолжить? (да/нет)");
                res = scanner.next();
                if (res.equals("нет")) {
                    System.out.println("Завершение программы");
                    return;
                }
            } while (!res.equals("да"));
        }
    }
}
