package ru.progwards.java1.lessons.arrays2;


import java.lang.reflect.Array;
import java.util.Arrays;

public class IntArrays {
    public static String toString(int[] a) {
        String b = "[";
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) b = b + a[i] + ","+" ";
            if (i == a.length - 1) {
                b += a[i] + "]";
            }
        }
        return b;
    }

    public static boolean equals1(int[] a1, int[] a2) {
        int b = 0;
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1.length; j++) {
                if (a1[i] == a2[j]) {
                    b++;
                }
            }
        }
        if (b != a1.length) {
            return false;
        }
    return true;
    }

        public static boolean equals2 ( int[] a1, int[] a2){
            Arrays.sort(a1);
            Arrays.sort(a2);
            return Arrays.equals(a1, a2);
        }


    public static void main(String[] args) {
        int[] b = {1, 6,8};
        int[] a = {1, 6,8};

        System.out.println(IntArrays.toString(b));
        System.out.println(IntArrays.equals1(b,a));
        System.out.println(IntArrays.equals2(b,a));
    }
}