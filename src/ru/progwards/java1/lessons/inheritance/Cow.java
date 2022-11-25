package ru.progwards.java1.lessons.inheritance;


public class Cow extends Animal
{
    public Cow(String name) {
        super(name);
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