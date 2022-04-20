package ru.gb.pheonix;

public class SumCheck {
    public static void main(String[] args) {
        printWordNTimes();
        within10and20();
        isPositiveOrNegative();
        isNegative();
    }

    public static boolean within10and20() {
        int x1 = 7, x2 = 1;
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void isPositiveOrNegative() {
        int x = 20;
        if (x >= 0) {
            System.out.println(" Число положительное");
        } else {
            System.out.println(" Число отрицательное");
        }
    }

    public static boolean isNegative() {
        int x = 9;
        if (x < 0) {
            return true;
        }
        return false;
    }

    public static void printWordNTimes() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" Зима");
        }
    }
}
