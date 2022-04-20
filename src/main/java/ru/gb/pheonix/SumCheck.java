package ru.gb.pheonix;

public class SumCheck {
    public static void main(String[] args) {
    }

    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println(" Число положительное");
        } else {
            System.out.println(" Число отрицательное");
        }
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < 5; i++) {
            System.out.println("зима");
        }
    }
}
