package ru.progwards.java1.lessons.interfaces2;




public class Hamster extends Animal {
    public Hamster(String name, double weight) {
        super(name, weight);
    }

    public Hamster(String name) {
        super(name);
    }

    public Hamster() {
    }

    @Override
    public String getHome() {
        return "поле";
    }

    @Override
    public Color getColor() {
        return Color.BEIGE;
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
