package ru.progwards.java1.lessons.interfaces1;


public class Hamster extends Animal {
    public Hamster(String name,double weight) {
        super(name, weight);
    }

    public Hamster() {
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
    }

    @Override
    public String getHome() {
        return null;
    }
}
