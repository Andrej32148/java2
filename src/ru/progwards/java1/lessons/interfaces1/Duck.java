package ru.progwards.java1.lessons.interfaces1;


public  class Duck extends Animal {
    public Duck(String name,double weight) {
        super(name, weight);
    }

    @Override
    public Color getColor() {
        return Color.GRAY;
    }

    @Override
    public String getHome() {
        return null;
    }

    @Override
    public String say() {
        return "кря-кря" ;
    }

    @Override
    public String kind() {
        return "утка";
    }
    @Override
    public double getFoodCoeff(){
        return 0.04;
    }
    @Override
    public FoodKind getFoodKind(){
        return FoodKind.CORN;
    }
}