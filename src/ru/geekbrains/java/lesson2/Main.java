package ru.geekbrains.java.lesson2;

public class Main {

    public static void main(String[] args) {
        int[] onesAndZeros = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArray(onesAndZeros);
        reverseValArray(onesAndZeros);
        printArray(onesAndZeros);
        System.out.println();

        int arr2[] = new int[8];
        printArray(arr2);
        fillArray(arr2);
        printArray(arr2);
        System.out.println();

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray(arr3);
        processArr(arr3);
        printArray(arr3);
        System.out.println();

        int matrixSize = 5;
        int matrix[][] = new int[matrixSize][matrixSize];
        fillMatrixDiagonals(matrix);
        int i = 0;
        int j;
        while (i < matrixSize)
        {
            j = 0;
            while (j < matrixSize)
            {
                System.out.printf("%d ", matrix[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();

        printArray(arr3);
        printMinMax(arr3);
        System.out.println();


        printArray(onesAndZeros);
        System.out.println(checkBalance(onesAndZeros));
        printArray(arr2);
        System.out.println(checkBalance(arr2));
        printArray(arr3);
        System.out.println(checkBalance(arr3));

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

    public static void fillMatrixDiagonals(int[][] matrix) {
        int i = 0;
        int j;
        while (i < matrix.length) {
            j = 0;
            while (j < matrix[i].length) {
                if ((i == j) || ((i + j + 1) == matrix.length)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                j++;
            }
            i++;
        }
    }

    public static void printMinMax(int[] arr) {
        if (arr.length < 1) {
            System.out.println("Ee-ou-ee-ou, I can't use exceptions yet.");
        }
        int min = 0;
        int max = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr[min]) {
                min = i;
            }
            if (arr[i] > arr[max]) {
                max = i;
            }
            i++;
        }
        System.out.printf("Min arr[%d] = %d\nMax arr[%d] = %d\n",
                          min,
                          arr[min],
                          max,
                          arr[max]);
    }

    public static boolean checkBalance(int[] arr) {
        if (arr.length < 2) {
            return false;
        }
        int median = 1;
        boolean result = false;
        int leftSumm, rightSumm;
        int i;
        while ((median < arr.length) && !result) {
            i = 0;
            leftSumm = 0;
            rightSumm = 0;
            while (i < arr.length) {
                if (i < median) {
                    leftSumm += arr[i];
                } else {
                    rightSumm += arr[i];
                }
                i++;
            }
            if (leftSumm == rightSumm) {
                result = true;
            }
            median++;
        }
        return result;
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        int i = 0;
        while (i < arr.length) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
            i++;
        }
        System.out.println("]");
    }
}
