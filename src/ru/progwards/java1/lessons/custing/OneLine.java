package ru.progwards.java1.lessons.custing;

public class OneLine {
    public static String strValue(String value){
        return "Передана строка со значением "+value;
    }
    public static String intValue(String variable,  int value){
        return "Значение "+variable+" равно "+Integer.toString(value);
    }
    public static String square(int n){
        return "Число "+n+" в квадрате равно "+(int)Math.pow(n,2);
    }
    public static String sum(int n, int m){
        return "Сумма "+n+" и "+"равна "+(n+m);
    }



    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(intValue("pou",7));
        System.out.println(sum(6,48));
    }
}
