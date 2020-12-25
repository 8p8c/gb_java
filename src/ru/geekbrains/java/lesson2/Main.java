package ru.geekbrains.java.lesson2;

public class Main {

    public static void main(String[] args) {
        int[] onesAndZeros = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        reverseValArray(onesAndZeros);
        int i = 0;
        System.out.print("[ ");
        while (i < onesAndZeros.length) {
            System.out.printf("%d, ", onesAndZeros[i]);
            i++;
        }
        System.out.println("]");

        int arr2[] = new int[8];
        fillArray(arr2);
        System.out.print("[ ");
        i = 0;
        while (i < arr2.length) {
            System.out.printf("%d, ", arr2[i]);
            i++;
        }
        System.out.println("]");

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        processArr(arr3);
        System.out.print("[ ");
        i = 0;
        while (i < arr3.length) {
            System.out.printf("%d, ", arr3[i]);
            i++;
        }
        System.out.println("]");
    }

    public static void reverseValArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            i++;
        }
    }

    public static void fillArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            arr[i] = i * 3;
            i++;
        }
    }

    public static void processArr(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            i++;
        }
    }
}
