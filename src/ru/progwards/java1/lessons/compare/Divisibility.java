package ru.progwards.java1.lessons.compare;

public class Divisibility {
    public static void check(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("На ноль делить нельзя");

        }
        else {
        double a = num1 % num2;
        double b = (double) num1 / (double) num2;

        if (a == 0) {
            System.out.println(num1 + " делится нацело на " + num2);
        }


        System.out.println("Остаток от деления " + num1 + " на " + num2 + " равен " +a);

        System.out.println("Частное от деления " + num1 + " на " + num2 + " равно " + b);
    }}

    public static void main(String[] args) {
        check(10, 0);
    }
}


