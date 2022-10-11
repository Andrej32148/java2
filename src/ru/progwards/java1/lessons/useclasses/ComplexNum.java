package ru.progwards.java1.lessons.useclasses;

public class ComplexNum {

    private final int i = (int) Math.sqrt(-1.0);
    private int a;
    private int b;


    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return a + "+" + b + "i";
    }

    public ComplexNum add(ComplexNum num) {

        return new ComplexNum((a + num.a), (b + num.b));
    }

    public ComplexNum sub(ComplexNum num) {

        return new ComplexNum((a - num.a), (b - num.b));
    }

    public ComplexNum mul(ComplexNum num) {

        return new ComplexNum((a * num.a) - (b * num.b), (b * num.a) + (a * num.b));
    }

    public ComplexNum div(ComplexNum num) {
        return new ComplexNum(((a * num.a) + (b * num.b)) / (num.a * num.a * num.b * num.b), ((b * num.a) - (a * num.b)) / (num.a * num.a + num.b * num.b));
    }

    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(2, 7);
        ComplexNum c2 = new ComplexNum(3, 8);
        System.out.println(c1.add(c2));
        System.out.println(c1.mul(c2));
        System.out.println(c1.sub(c2));


    }
}
