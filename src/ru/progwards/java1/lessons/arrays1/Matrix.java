package ru.progwards.java1.lessons.arrays1;

public class Matrix {
    private int[][] a;
    int b = 0;

    public Matrix(int[][] a) {
        this.a = a;
    }

    public int maxInCol(int num) {

        for (int i = 0; i < num; i++) {
            if (a[i][num] > a[i + 1][num])
                b = a[i][num];
        }
        return b;
    }

    public int maxInRow(int num) {

        for (int i = 0; i < num - 1; i++) {
            if (a[num][i] > a[num][i + 1])
                b = a[num][i];
        }
        return b;
    }


    public int max() {

        for (int i = 0; i < a.length; i++) {
            if (maxInCol(i) > maxInCol(++i)) {
                b = maxInCol(i);
            }
        }
        return b;
    }

    public boolean isMatrix(){
        if (a.length!=a[0].length){
            return false;
        }
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length-1; j++) {
                if (a[i].length!=a[i+1].length) {
                    return false;
                }

            }

        }
        return true;
    }
    public int[][] transposition() {
        int[][]b=new int[a[0].length][a.length];
        int[]c=new int[a.length*a[0].length];

        if (!isMatrix()){
            return null;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[j+i*a[i].length]= a[i][j];

            }}
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j]= c[j+i*a[j].length];
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i][j]);
            }
            System.out.println();

        }
        return b;
    }



    }

