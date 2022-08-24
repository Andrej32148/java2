package ru.progwards.java1.lessons.wrappers;

public class AccuracyDoubleFloat {
   private static double p=3.14;
   private static float p1=3.14f;


    public static Double volumeBallDouble(Double radius){

        return 4.0/3.0*p*Math.pow(radius,3);
    }
    public static Float volumeBallFloat(Float radius){
        return  4.0f/3.0f*p1*radius*radius*radius;
    }
    public static Double calculateAccuracy(Double radius){
        return volumeBallDouble(radius)-volumeBallFloat(radius.floatValue());
    }

    public static void main(String[] args) {
        System.out.println(volumeBallDouble(6371.2));

        System.out.println(volumeBallFloat(6371.2f));
        System.out.println(calculateAccuracy(6371.2));
    }
}
