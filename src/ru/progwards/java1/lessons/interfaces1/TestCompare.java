package ru.progwards.java1.lessons.interfaces1;



import java.util.Arrays;

public class TestCompare {
    public static void main(String[] args) {
        Animal [] animals={new Cow("Пеструшка", 350.0),new Cow("Рыжая",250.0), new Duck("Даша",3.0), new Duck("Маша",3.5), new Hamster("Акакий",0.25),
      new Hamster("Поликарп",0.32)};
        Arrays.sort(animals);
        String a="[";
        for (int i = 0; i < animals.length-1; i++) {
    a+=animals[i]+", ";

    }
        a=a+animals[animals.length-1]+"]";
        System.out.println(a);
}}
