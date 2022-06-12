package ru.gb.pheonix.hw6;

public class Bird extends Animal {

    public static final int RUN_LIMIT = 10;
    public static final int SWIM_LIMIT = 1;

    public Bird(String name) {
        super(name, RUN_LIMIT, SWIM_LIMIT);
    }

    @Override
    public String toString() {
        return "Птичка по имени " + getName();
    }
}
