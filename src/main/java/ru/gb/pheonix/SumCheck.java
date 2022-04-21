package ru.gb.pheonix;

public class SumCheck {
    public static void main(String[] args) {
        printTextNTimes("abc", 3);

    }

    public static boolean checkIfSumBetween10And20( int x1, int x2) {
        int sum = x1 + x2;
        return sum >= 10 && sum <= 20;
    }

    public static void printNumberSign(int a) {
        if (a >= 0) {
            System.out.println(" Число положительное");
        } else {
            System.out.println(" Число отрицательное");
        }
    }

    public static boolean isNegative(int a) {
        return a < 0;
    }

    public static void printTextNTimes(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
