package ru.progwards.java1.lessons.cycles;

public class NumbersRange {
    public static long sumNumbers(int start, int finish) {
        long s = 0;
        for (int i = start; i <= finish; i++) {
            s += i;
        }
        return s;
    }

    public static long sumOdd(int start, int finish) {
        long s = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                s += i;
            }
        }
        return s;
    }

    public static long sumEvenIdx(int start, int finish) {

        int res = 0;
        for (; start <= finish; start++) {
            res += start++;
        }
        return res;
    }
    public static void main(String[] args) {

        System.out.println(sumEvenIdx(2, 8));
    }
}