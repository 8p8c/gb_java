package ru.geekbrains.java.lesson4;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    //private static Random rand = new Random();
    private static char[][] map;
    private static final int SIZE = 5;
    private static final int WIN_STREAK = 3;
    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = '✖';
    private static final char DOT_O = '◯';
    private static boolean isGameFinished;

    public static void main(String[] args) {
        map = new char[SIZE][SIZE];
        initMap(map);
        isGameFinished = false;
        while (!isGameFinished) {
            askForTurn(map);
            doCompTurn(map);
        }
        scanner.close();
    }

    private static void initMap(char[][] playMap) {
        int i = 0;
        int j;
        while (i < SIZE) {
            j= 0;
            while (j < SIZE) {
                playMap[i][j] = DOT_EMPTY;
                j++;
            }
            i++;
        }
    }

    private static void askForTurn(char[][] playMap) {
        printMap(map);
        int x;
        int y;
        do {
            System.out.print("Введите координаты в формате X Y: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(map, x, y));
        playMap[x][y] = DOT_X;
        if (isWon(playMap, DOT_X)) {
            printMap(playMap);
            System.out.println("X win");
            isGameFinished = true;
        }
    }

    private static void doCompTurn(char[][] playMap) {
        int x;
        int y;
        do {
            x = (int)(Math.random() * SIZE);//rand.nextInt(SIZE);
            y = (int)(Math.random() * SIZE);//rand.nextInt(SIZE);
        } while (playMap[x][y] != DOT_EMPTY);
        playMap[x][y] = DOT_O;
        if (isWon(playMap, DOT_O)) {
            printMap(playMap);
            System.out.println("O win");
            isGameFinished = true;
        }
    }

    private static boolean isCellValid(char[][] playMap, int x, int y) {
        if ((x < 0) || (x >= SIZE)) {
            return false;
        }
        if ((y < 0) || (y >= SIZE)) {
            return false;
        }
        if (playMap[x][y] != DOT_EMPTY) {
            return false;
        }
        return true;
    }

    private static boolean isWon(char[][] playMap, char type) {
        if (isWonRow(playMap, type)) {
            return true;
        }
        if (isWonColumn(playMap, type)) {
            return true;
        }
        if (isWonDiag(playMap, type)) {
            return true;
        }
        return false;
    }

    private static boolean isWonRow(char[][] playMap, char type) {
        int x;
        int y = 0;
        int inRow;
        while (y < SIZE) {
            x = 0;
            inRow = 0;
            while (x < SIZE) {
                if (playMap[x][y] == type) {
                    inRow++;
                }
                else {
                    inRow = 0;
                }
                if (inRow >= WIN_STREAK) {
                    return true;
                }
                x++;
            }
            y++;
        }
        return false;
    }

    private static boolean isWonColumn(char[][] playMap, char type) {
        int x = 0;
        int y;
        int inRow;
        while (x < SIZE) {
            y = 0;
            inRow = 0;
            while (y < SIZE) {
                if (playMap[x][y] == type) {
                    inRow++;
                }
                else {
                    inRow = 0;
                }
                if (inRow >= WIN_STREAK) {
                    return true;
                }
                y++;
            }
            x++;
        }
        return false;
    }

    private static boolean isWonDiag(char[][] playMap, char type) {
        int x;
        int y;
        int inRow = 0;
        int shift = WIN_STREAK - SIZE;
        while (shift <= SIZE - WIN_STREAK) {
            x = 0;
            while (x < SIZE) {
                y = 0;
                while (y < SIZE) {
                    if (x - y + shift == 0) {
                        if (playMap[x][y] == type) {
                            inRow++;
                        }
                        else {
                            inRow = 0;
                        }
                        if (inRow >= WIN_STREAK) {
                            return true;
                        }
                    }
                    y++;
                }
                x++;
            }
            shift++;
        }
        x = 0;
        y = 0;
        inRow = 0;
        shift = WIN_STREAK - SIZE;
        while (shift <= SIZE - WIN_STREAK) {
            x = 0;
            while (x < SIZE) {
                y = 0;
                while (y < SIZE) {
                    if (x + y + 1 - SIZE + shift == 0) {
                        if (playMap[x][y] == type) {
                            inRow++;
                        }
                        else {
                            inRow = 0;
                        }
                        if (inRow >= WIN_STREAK) {
                            return true;
                        }
                    }
                    y++;
                }
                x++;
            }
            shift++;
        }
        return false;
    }

    private static void printMap(char[][] playMap) {
        int i = 0;
        int j;
        System.out.print("  ");
        while (i < SIZE) {
            System.out.printf(" %d", i + 1);
            i++;
        }
        System.out.println();
        i = 0;
        while (i < SIZE) {
            j = 0;
            System.out.printf("%d ", i + 1);
            while (j < SIZE) {
                System.out.printf(" %c", playMap[j][i]);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
