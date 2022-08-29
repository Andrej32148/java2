package ru.progwards.java1.lessons.custing;

public class OneLine {
    public static String strValue(String value) {
        return "Передана строка со значением " + value;
    }
    public static String intValue(String variable, int value) {
        return "Значение " + variable + " равно " + Integer.toString(value);
    }
    public static String square(int n) {
        return "Число " + n + " в квадрате равно " + (int) Math.pow(n, 2);
    }
    public static String sum(int n, int m) {
        return "Сумма " + n + " и " + m + " равна " + (n + m);
    }
    public static double calculateAccuracy() {
        double d = (double) (1 / 3);
        float f = (float) d;
        return d;
    }
    public static double circle(double r) {
        return 4 * 3.14 * Math.pow(r, 2);
    }
    public static double square(double n) {
        return n * n;
    }
    public static Double triangle(double k) {
        double p = (k * 3) / 2;
        return Math.sqrt(p * ((p - k) * 3));
    }
    public static double squareVsTraiange(double p) {
        return square(p) / triangle(p);
    }
    public static double squareVsCircle(double p) {
        return square(p) / circle(p);
    }
    public static double triangleVsCircle(double p) {
        return triangle(p) / circle(p);
    }


    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(intValue("pou", 7));
        System.out.println(sum(6, 48));
        System.out.println(calculateAccuracy());
        System.out.println(circle(6));
        System.out.println(triangle(7));
        System.out.println(squareVsTraiange(7));
        System.out.println(squareVsCircle(7));
    }
}
