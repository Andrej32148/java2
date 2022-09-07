package ru.progwards.java1.lessons.compare;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        if (c > b && c > a) {
            return c;
        }
        return 0;
    }

    public static int minSide(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        if (b < a && b < c) {
            return b;
        }

        if (c < b && c < a) {
            return c;
        }


        return 0;

    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(maxSide(5, 1, 12));
        System.out.println(minSide(7, 9, 5));

    }
}


