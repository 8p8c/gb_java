package ru.geekbrains.java.lesson1;

public class Main {

    public static void main(String[] args) {
        int someInt = 0;
        float someFloat = 0.0f;
        byte someByte = 127;
        short someShort = -32768;
        long someLong = 0L;
        double someDouble= 6.28d;
        char cChar= 'C';
        boolean bTrue= true;
        String someString = ""; //Empty string is also a string;
    }

    public static float math(float a, float b, float c, float d) {
        if (d == 0) { // I'd better use something like (Math.abs(d) <= float.MIN_VALUE)
            return 0.0f;
        } else {
            float result = a * (b + (c / d));
            return result;
        }
    }

    public static boolean checkRange(int a, int b) {
        int summ;
        summ = a + b; //FIXME. How do I avoid overflow here?
        if ((summ >= 10) && (summ <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositive(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static void helloName(String name) {
        StringBuilder result = new StringBuilder();

        result.append("Привет, ");
        result.append(name);
        result.append("!");
        System.out.println(result.toString());
    }

    public static boolean isLeap(int year) {
        if (year == 0) {
            return false; //Should raise exception here. Year number is never 0.
        }
        if (year < 1582) {
            return false; //Rules for pre-Gregorian years are much more complicated than following.
        }
        if ((year % 400) == 0) {
            return true;
        } else if ((year % 100) == 0) {
            return false;
        } else if ((year % 4) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
