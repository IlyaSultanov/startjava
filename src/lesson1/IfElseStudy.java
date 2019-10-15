package lesson1;

public class IfElseStudy {

    public static void main(String[] args) {

        byte age = 25;

        boolean sex = true;

        float height = 1.70f;

        String name = "Михаил";

        if (age > 20) {
            System.out.println("Возраст больше " + age);
        }

        if (sex) {
            System.out.println("Пол мужской");
        }

        if (!sex) {
            System.out.println("Пол женский");
        }

        if (height < 1.80) {
            System.out.println("Рост меньше " + height);
        } else {
            System.out.println("Рост больше " + height);
        }

        if (name.startsWith("М")) {
            System.out.println("Имя начинается с М");
        } else {
            if (name.startsWith("И")) {
                System.out.println("Имя начинается с И");
            } else {
                System.out.println("Имя не начинается ни с М, ни с И");
            }
        }
    }
}
