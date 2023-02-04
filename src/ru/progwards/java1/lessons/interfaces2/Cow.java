package ru.progwards.java1.lessons.interfaces2;


import ru.progwards.java1.lessons.interfaces1.Animal;
import ru.progwards.java1.lessons.interfaces1.Color;

public class Cow extends Animal
{
    public Cow(String name, double weight) {
        super(name,weight);

    }

    @Override
    public String getHome() {
        return "ферма";
    }

    @Override
    public Color getColor() {
return Color.RED;
    }

    @Override
    public String say() {
        return  "мууууууу";
    }
    @Override
    public String kind() {
        return "корова";
    }
    @Override
    public double getFoodCoeff(){
return 0.05;
    }
    @Override
    public FoodKind getFoodKind(){
        return FoodKind.HEY;
    }
}