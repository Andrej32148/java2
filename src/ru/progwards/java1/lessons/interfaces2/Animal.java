package ru.progwards.java1.lessons.interfaces2;

public abstract class Animal extends CompareHome implements IColor, Home,Comparable<Animal>,ToString,CompareWeight{
    private String name;
    private Double weight;
private Color color;

    public enum FoodKind {
        HEY,
        CORN,
    }
public Animal(){};
    @Override
    public String getString() {
        return toString();
    }

    abstract public FoodKind getFoodKind();

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeight) {
        if(this.getWeight()>smthHasWeight.getWeight())
            return CompareResult.GREATER;
        if(this.getWeight()==smthHasWeight.getWeight())
            return CompareResult.EQUAL;
        else return CompareResult.LESS;
    }

    public double getWeight() {
        return weight;
    }

    abstract public double getFoodCoeff();

    public double calculateFoodWeight() {
        return weight * getFoodCoeff();
    }

    public double calculateFoodPrice() {
        double a=0;
        if (getFoodKind() == FoodKind.HEY) {
             a=calculateFoodWeight() * 2.00;

        }
        if (getFoodKind() == FoodKind.CORN) {
             a=calculateFoodWeight() * 15.00;
        }
        return a;
    }
    public Animal(String name, double weight) {
            this.name = name;
            this.weight=weight;
        }

        public abstract String kind ();

        public abstract String say ();

        public String toString () {
            return "Это "+kind() +" "+name +" "+weight+" "+getColor();

        }

        public void setWeight ( double weight){
            this.weight = weight;
        }

        public int compareTo(Animal animal){
            return weight.compareTo(animal.weight);
        }

        public boolean equals (Animal o){
            return name.equals(o.name) & weight.equals(o.name) & kind().equals(o.kind());
        }
    }
