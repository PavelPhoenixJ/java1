package ru.gb.pheonix.homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
     public static void checkSumSign() {
        int a = -5;
        int b = 7;
        int c = a + b;
        if (c >= 0){
            System.out.println("The amount is positive");
        } else {
            System.out.println("The amount is negative");
        }

    }
    public static void printColor() {
        int value = 170;
        if (value <= 0) {
            System.out.println("red");
        } if (0 < value && value <= 100){
            System.out.println("yellow");
        } if (100 < value) {
            System.out.println("green");
        }
    }
    public static void compareNumbers() {
        int a = 99;
        int b = 27;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }


}
