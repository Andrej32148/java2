package ru.progwards.java1.lessons.inheritance;

public class Hamster extends Animal{
    public Hamster(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "хрум-хрум-хрум" ;
    }

    @Override
    public String kind() {
        return "хомяк";
    }

    @Override
    public double getFoodCoeff(){
        return 0.06;
    }
    @Override
    public FoodKind getFoodKind(){
        return FoodKind.CORN;
    }}
