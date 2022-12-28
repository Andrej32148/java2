package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {
    private int[] a;
public DIntArray(){

}
    public DIntArray(int[] a) {
        this.a = a;
    }

    public void add(int num) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length-1; i++) {
            b[i] = a[i];
        }
        b[b.length-1] = num;
        a = b;
    }

    public void atInsert(int pos, int num) {
        int p[] = new int[a.length + 1];
        for (int i = 0; i < pos; i++) {
            p[i] = a[i];
        }
        for (int i = pos; i < p.length; i++) {
            p[i] = a[i-1];
        }
        a = p;
        a[pos] = num;
    }

    public void atDelete(int pos) {
        int p[] = new int[a.length - 1];
        for (int i = 0; i < pos; i++) {
            p[i] = a[i];
        }
        for (int i = pos; i < p.length; i++) {
            p[i] = a[i + 1];
        }
        a = p;
    }
    public int at(int pos){
        return a[pos];
    }



    public static void main(String[] args) {
        int[] b = {1, 6,8};
        int[] a = {1, 6,8};
DIntArray v=new DIntArray(a);
v.atInsert(2,2);
v.add(4);
        System.out.println(Arrays.toString(a));
    }
}

