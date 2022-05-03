package ru.gb.pheonix;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i == 0 && j == 4 || i == 1 && j == 3 || i == 3 && j == 1 || i == 4 && j == 0) {
                    System.out.print(1 + "  ");
                } else {
                    System.out.print(arr[i] + "  ");
                }
            }
            System.out.println();

// решил по другому, просто для эксперимента (№4)
        }

    }

    // №5
    public static int[] newReturnArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    // №6
    public static int minAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return min;
    }


}