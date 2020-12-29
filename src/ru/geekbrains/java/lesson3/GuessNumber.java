package ru.geekbrains.java.lesson3;

import java.util.Scanner;

public class GuessNumber {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int range = 9;
        int tryCount = 3;
        int number;
        boolean playAgain = true;
        int intPlayAgain;
        while (playAgain) {
            number = (int)(Math.random() * range);
            playLevel(range, number, tryCount);
            System.out.println("Ну что, сыграем ещё раз? 1 -- да, 0 -- нет.");
            intPlayAgain = scanner.nextInt(); //Should use something more reliable here.
            playAgain = intPlayAgain == 1;
        }
        scanner.close();
    }

    private static void playLevel(int range, int number, int tryCount) {
        System.out.println("Угадайте число от 0 до " + range);
        int input_number;
        while (tryCount > 0) {
            tryCount--;
            input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали.");
                return;
            } else {
                if (tryCount > 0) {
                    System.out.printf("Попробуйте ещё. Попыток осталось: %d\n", tryCount);
                }
            }
        }
        System.out.println("Вы не угадали.");
    }
}
