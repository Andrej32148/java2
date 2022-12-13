package ru.progwards.java1.lessons.arrays1;

public class ArraySort {
    public static void sort(int[] a){
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length; j++) {
               if(a[i]<a[j]){
                   int b=a[i];
                   a[i]=a[j];
                   a[j]=b;
               }
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a={5,3,9,2,1};
        sort(a);
    }
}
