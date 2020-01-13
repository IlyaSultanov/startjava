package com.startjava.lesson2.game;

public class Player {

    private String name;
    private int number;
    private int countOfTry;
    private int[] enteredNumbers = new int[10];

    public Player(String name, int countOfTry) {
        this.name = name;
        this.countOfTry = countOfTry;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCountOfTry() {
        return countOfTry;
    }

    public void setCountOfTry(int countOfTry) {
        this.countOfTry = countOfTry;
    }

    public void setEnteredNumber(int number) {
        enteredNumbers[10 - countOfTry] = number;
    }

    public void setNullArray() {
        enteredNumbers = new int[10];
    }

    public int[] getEnteredNumber() {
        return enteredNumbers;
    }
}
