package ru.progwards.java1.lessons.custing;

public class Figures {
    public static double circle(double r) {
        return 3.14 * Math.pow(r, 2);
    }
    public static double square(double n) {
        return n * n;
    }
    public static Double triangle(double k) {
        double p = (k+k+k)/2.0;
        return Math.sqrt(p * (p - k) *(p-k)*(p-k));
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
        System.out.println(circle( 51.458544129714824));;
    }}
