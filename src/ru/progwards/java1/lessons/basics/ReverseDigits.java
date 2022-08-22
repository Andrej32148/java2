package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static void main(String[] args) {
        System.out.println(reverseDigits(123));
        System.out.println(reverseDigits(456));
        System.out.println(reverseDigits(789));
    }

    public static int reverseDigits(int number) {
        int n1;
        n1 = number % 10;
        number /= 10;
        int n2 = number % 10;
        number /= 10;
        int n3 = number % 10;
        int n4 = n1;
        int n5 = n4 * 10 + n2;
        return     n5 * 10 + n3;
    }
}

