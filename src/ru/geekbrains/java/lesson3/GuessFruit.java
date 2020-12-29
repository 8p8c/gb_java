package ru.geekbrains.java.lesson3;

import java.util.Scanner;

public class GuessFruit {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Guess fruit from the list:");
        printWords(words);
        String word;
        boolean playAgain = true;
        int intPlayAgain;
        while (playAgain) {
            word = words[(int)(Math.random() * words.length)]; //Pick random word.
            playLevel(word);
            System.out.println("Ну что, сыграем ещё раз? 1 -- да, 0 -- нет.");
            intPlayAgain = scanner.nextInt(); //Should use something more reliable here.
            playAgain = intPlayAgain == 1;
        }
        scanner.close();
    }

    private static void playLevel(String word) {
        String guess;
        int i;
        System.out.printf("%c##############\n", word.charAt(0));
        while (true) {
            guess = scanner.nextLine();
            System.out.printf("%c", word.charAt(0));
            i = 1;
            while (i < word.length() && i < guess.length()) {
                if (word.charAt(i) == guess.charAt(i)) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print("#");
                }
                i++;
            }
            while (i < 15) {
                System.out.print("#");
                i++;
            }
            System.out.println();
            if (word.equals(guess)) {
                System.out.println("Вы угадали.");
                return;
            }
        }
    }

    private static void printWords(String[] words) {
        System.out.print(words[0]);
        int i = 1;
        while (i < words.length) {
            System.out.printf(", %s", words[i]);
            i++;
        }
        System.out.println();
    }
}
