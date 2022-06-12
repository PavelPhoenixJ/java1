package ru.gb.pheonix.hw6;

public abstract class Animal {

    private String name;
    private int runLimit;
    private int swimLimit;
    private static int count;


    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++;
    }


    public String getName() {
        return name;
    }

    public void run(int length) {
        if (length <= runLimit) {
            System.out.println(this + " бежит " + length + " метров");
        } else {
            System.out.println(this + " не способен пробежать " + length + " метров");
        }
    }

    public void swim(int length) {
        if (length <= swimLimit) {
            System.out.println(this + " плывёт " + length + " метров");
        } else {
            System.out.println(this + " не способен проплыть " + length + " метров");
        }
    }

    public static int getCount() {
        return count;
    }
}
