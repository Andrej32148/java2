package ru.progwards.java1.lessons.inheritance;

public  class Duck extends Animal {
    public Duck(String name) {
        super(name);
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
