package com.startjava.lesson2.wolf;

public class WolfTest {

    public static void main(String[] args) {
        Wolf woolfy = new Wolf();
        woolfy.setAge(9);
        woolfy.setColor("white");
        woolfy.setGender("suka");
        woolfy.setWeight(15);
        woolfy.setName("Woolfy");

        System.out.println(woolfy.getAge() + " " + woolfy.getColor() + " " + woolfy.getGender() + " " + woolfy.getWeight() + " " + woolfy.getName());

        woolfy.go();
        woolfy.howl();
        woolfy.hunt();
        woolfy.run();
        woolfy.sit();
    }
}
