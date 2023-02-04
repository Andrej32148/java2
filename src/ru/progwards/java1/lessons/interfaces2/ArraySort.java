package ru.progwards.java1.lessons.interfaces2;

public class ArraySort {
    public static void main(String[] args) {
      Cow cow = new Cow("Пеструшка", 350.0);
        Duck duck = new Duck("Даша", 3.0);
        Hamster hamster = new Hamster("Поликарп", 0.25);
        CompareWeight[] compareWeight = new CompareWeight[3];
        compareWeight[0] = (CompareWeight) cow;
        compareWeight[2] = (CompareWeight) duck;
        compareWeight[1] = (CompareWeight) hamster;
        sort(compareWeight);
    }
    public static void sort (CompareWeight[] a){
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i].compareWeight(a[j])== CompareWeight.CompareResult.LESS){
                    CompareWeight b=a[i];
                    a[i]=a[j];
                    a[j]=b;
                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


}
