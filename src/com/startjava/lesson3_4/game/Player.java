package com.startjava.lesson3_4.game;

public class Player {

    private static final int CAPACITY = 10;
    private String name;
    private int number;
    private int countOfTry;
    private int[] enteredNumbers = new int[CAPACITY];

    public Player(String name) {
        this.name = name;
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
        enteredNumbers[CAPACITY - countOfTry] = number;
    }

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }

    public int getArrayCapacity() {
        return CAPACITY;
    }

}
