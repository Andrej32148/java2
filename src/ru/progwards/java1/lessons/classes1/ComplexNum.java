package ru.progwards.java1.lessons.classes1;

public class ComplexNum {

    private final int i = (int) Math.sqrt(-1.0);
    private int a;
    private int b;
    private double z;
    private double v;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public String toString() {
        return a + "+" + b + "*" + "i";
    }
    public ComplexNum add(ComplexNum num) {
        a = (this.a + num.a);
        b = (this.b + num.b);
        ComplexNum c3 = new ComplexNum(a, b);
        return c3;
    }
    public ComplexNum sub(ComplexNum num) {
        a = (this.a - num.a);
        b = (this.b - num.b);
        ComplexNum c3 = new ComplexNum(a, b);
        return c3;
    }

    public ComplexNum mul(ComplexNum num) {
        a = (this.a * num.a) - (this.b * num.b);
        b = (this.b * num.a) - (this.a * num.b);
        ComplexNum c3 = new ComplexNum(a, b);
        return c3;

    }

    public ComplexNum div(ComplexNum num) {
        a  = ((this.a * num.a) + (this.b * num.b)) / (num.a * num.a * num.b * num.b);
        b = ((this.b * num.a) - (this.a * num.b)) / (num.a * num.a * num.b * num.b);
        ComplexNum c3 = new ComplexNum(a, b);
        return c3;
    }
    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(2, 7);
        ComplexNum c2 = new ComplexNum(3, 8);
        System.out.println(c1.add(c2));

        System.out.println(c1.toString());

    }
}
