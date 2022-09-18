package ru.progwards.java1.lessons.cycles;

public class GoldenFibo {
    public static int fiboNumber(int n) {
        int a = 1;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            if (n <= 2) {
                return b;
            }
            if (i > 2)
                a = a + b;
            b = a - b;

        }
        return a;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        double n = 0;
        if (a == b) {
            n = (double) a / (double) c;
        }
        if (c == b) {
            n = (double) b / (double) a;
        }
        if (a == c) {
            n = (double) a / (double) b;
        }
        if (n >= 1.61703 && n <= 1.61903) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            System.out.println(fiboNumber(i));
        }
        for (int i = 0; i < 15; i++) {
            if (fiboNumber(i + 1) > 100) {
                return;
            }
            System.out.println(isGoldenTriangle(fiboNumber(i), fiboNumber(i + 1), fiboNumber(i + 1)));
            if (isGoldenTriangle(fiboNumber(i), fiboNumber(i + 1), fiboNumber(i + 1)) == true) {
                System.out.println(fiboNumber(i));
                System.out.println(fiboNumber(i + 1));
                System.out.println(fiboNumber(i + 1));
            }
        }

    }
}
