package ru.progwards.java1.lessons.classescompare;


public class Test {
    public static void main(String[] args) {
        System.out.println("Тест для Animal, Cow, Hamster, Duck");
        Cow cow2 = new Cow("Kate");
        Duck duck = new Duck("Ola");
        Hamster hamster = new Hamster("Игорь");
        cow2.setWeight(100);
        hamster.setWeight(0.7);
        duck.setWeight(2);
        System.out.println(cow2.calculateFoodWeight());
        System.out.println(hamster.calculateFoodWeight());
        System.out.println(duck.calculateFoodWeight());
        System.out.println(duck.calculateFoodPrice());
        System.out.println(cow2.calculateFoodPrice());
        System.out.println(hamster.calculateFoodPrice());


    }

}

