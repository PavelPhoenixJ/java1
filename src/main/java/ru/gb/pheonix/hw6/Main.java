package ru.gb.pheonix.hw6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Мурзик"),
                new Dog("Барбос"),
                new Cat("Мурка"),
                new Dog("Бобик")
        };
        final Random random = new Random();


        for (Animal animal : animals) {
            animal.run(random.nextInt(500));
            animal.swim(random.nextInt(50));
        }


    }
}
