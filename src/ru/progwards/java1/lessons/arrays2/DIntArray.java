package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {
    private int[] a;

    public DIntArray() {

    }

    public DIntArray(int[] a) {
        this.a = a;
    }




    public void add(int num) {
        int[] p = new int[a.length + 1];
        System.arraycopy(a, 0, p, 0, a.length);
        p[p.length - 1] = num;
        a = p;
    }

    public void atInsert(int pos, int num) {
        int p[] = new int[a.length + 1];
        System.arraycopy(a, 0, p, 0, a.length);
        p[pos] = num;
        System.arraycopy(a, pos, p, pos + 1, a.length);
        a = p;
    }



    public void atDelete(int pos) {
        int p[] = new int[a.length - 1];
        System.arraycopy(a, 0, p, 0, a.length);
        System.arraycopy(a, pos, p, pos - 1, a.length);
        a = p;
    }

    public int at(int pos) {
        return a[pos];
    }


    public static void main(String[] args) {
        int[] b = {1, 6, 8};
        int[] a = {1, 6, 8};
        DIntArray v = new DIntArray(a);


        v.atDelete(0);
        System.out.println(Arrays.toString(v.a));
    }
}

