package ru.progwards.java1.lessons.interfaces2;



public class CompareHome {
    public static boolean sameHome(Home h1, Home h2){
        System.out.println("Результат сравнения"+h1.getClass().getSimpleName()+" и "+h2.getClass().getSimpleName()+" равен "+h1.equals(h2));
       return h1.equals(h2);}

    public static void main(String[] args) {
     Cow cow=new Cow("Пеструшка", 350.0);
   Duck duck=new  Duck("Даша",3.0);
    Hamster hamster=new Hamster("Акакий",0.25);
Hawk hawk=new Hawk();
sameHome(cow,duck);
sameHome(cow,hamster);
sameHome(cow,hawk);
sameHome(duck,hawk);
sameHome(duck,hawk);
sameHome(hamster,hawk);

    }}