package ru.gb.pheonix.hw6;

public class Dog extends Animal {

    public static final int RUN_LIMIT = 500;
    public static final int SWIM_LIMIT = 10;

    public Dog(String name) { super(name, RUN_LIMIT, SWIM_LIMIT);}

    @Override
    public String toString() {
        return "Собака по имени " + getName();
    }
}