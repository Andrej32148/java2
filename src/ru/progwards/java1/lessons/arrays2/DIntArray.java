package ru.progwards.java1.lessons.arrays2;

public class DIntArray {
    private int[] a;

    public DIntArray(int[] a) {
        this.a = a;
    }

    public void add(int num) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[a.length - 1] = num;
        a = b;
    }

    public void atInsert(int pos, int num) {
        int p[] = new int[a.length + 1];
        for (int i = 0; i < pos; i++) {
            p[i] = a[i];
        }
        for (int i = pos; i < p.length; i++) {
            p[i + 1] = a[i];
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
}

