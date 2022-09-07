package ru.progwards.java1.lessons.compare;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        return (a < (b + c) && b < (a + c) && c < (b + a));
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        return Math.pow((double) a, 2) == Math.pow((double) b, 2) + Math.pow((double) c, 2) || Math.pow((double) c, 2) == Math.pow((double) b, 2) + Math.pow((double) a, 2) || Math.pow((double) b, 2) == Math.pow((double) a, 2) + Math.pow((double) c, 2);
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || b == c || a == c;
    }


    public static void main(String[] args) {
        System.out.println(isTriangle(61,9,5));
    }
}