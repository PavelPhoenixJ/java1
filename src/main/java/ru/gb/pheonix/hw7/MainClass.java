package ru.gb.pheonix.hw7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat ("Barsik", 5);
        Plate plate = new Plate (100);
        System.out.println(plate);
        cat.eat(plate);
        System.out.println(plate);
    }
}
