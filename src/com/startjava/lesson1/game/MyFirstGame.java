package com.startjava.lesson1.game;

public class MyFirstGame {

    public static void main(String[] args) {
        byte age = 25;
        if (age > 20) {
            System.out.println("Возраст больше " + age);
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("Пол мужской");
        }

        if (!isMale) {
            System.out.println("Пол женский");
        }

        float height = 1.70f;
        if (height < 1.80) {
            System.out.println("Рост меньше " + height);
        } else {
            System.out.println("Рост больше " + height);
        }

        String name = "Михаил";
        if (name.startsWith("М")) {
            System.out.println("Имя начинается с М");
        } else if (name.startsWith("И")) {
            System.out.println("Имя начинается с И");
        } else {
            System.out.println("Имя не начинается ни с М, ни с И");
        }
    }
}

