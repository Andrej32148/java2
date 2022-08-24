package ru.progwards.java1.lessons.wrappers;

public class NumMetrics {
    public static Integer sumDigits(Integer number) {
        int number1 = number % 10;
        number /= 10;
        int number2 = number % 10;
        number /= 10;
        int number3 = number % 10;

        return number1 + number2 + number3;


    }

    public static Integer mulDigits(Integer number) {
        int number1 = number % 10;
        number /= 10;
        int number2 = number % 10;
        number /= 10;
        int number3 = number % 10;

        return number1 * number2 * number3;

    }

    public static void main(String[] args) {
        System.out.println(mulDigits(123));
        System.out.println(sumDigits(359));
    }
}
