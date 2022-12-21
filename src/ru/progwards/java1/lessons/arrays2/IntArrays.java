package ru.progwards.java1.lessons.arrays2;

import ru.progwards.java1.lessons.arrays1.ArraySort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IntArrays {
    public static String toString(int []a){
        String b="";
        for (int i = 0; i < a.length; i++) {
            b=b+a[i]+","+" ";
        }
        return b;
    }

    public static boolean equals1(int[] a1, int[] a2){
        if (a1.length== a2.length){
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1.length; j++) {
               if(a1[i]!=a2[j]){
return false;
               }
            }
        }
        return true;
    }

    public static boolean equals2(int[] a1, int[] a2){
        Arrays.sort(a1);
        Arrays.sort(a2);
     return   Arrays.equals(a1,a2);
    }
}
