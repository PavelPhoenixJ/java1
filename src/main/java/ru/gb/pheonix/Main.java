package ru.gb.pheonix;

public class Main {
    public static void main(String[] args) {
        System.out.println(tenTrue(5, 10));
        isPositive(9);
        System.out.println(isNegative(-3));
        timesStrings();
    }

    public static boolean tenTrue(int a, int b) {
        if (a + b > 10 && a + b < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositive(int a) {
        if (a >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void timesStrings() {
        for (int i = 0; i < 5; i++) {
            System.out.println("кошелёк");
        }
    }

}
