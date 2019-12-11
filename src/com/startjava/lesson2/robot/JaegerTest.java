package com.startjava.lesson2.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger samovar = new Jaeger("Russia", "RussianSamovar", "СН256ПРГ/251.42М", 65.2F, 15.1F, 2, 5, 28);

        Jaeger spaceX = new Jaeger("USA", "SpaceX", "Mark-8", 82.4F, 8.9F, 12, 17, 7);

        samovar.setArmor(spaceX.getArmor() + 15);

        System.out.println(samovar.getHeight() + spaceX.getHeight());
    }
}
