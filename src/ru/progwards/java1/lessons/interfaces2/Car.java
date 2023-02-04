package ru.progwards.java1.lessons.interfaces2;

public class Car implements CompareWeight{ double weight;

    public Car(double weight) {
        this.weight = weight;
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeight) {
        if (this.getWeight() > smthHasWeight.getWeight())
            return CompareResult.GREATER;
        if (this.getWeight() == smthHasWeight.getWeight())
            return CompareResult.EQUAL;
        else return CompareResult.LESS;
    }

    public double getWeight() {
        return weight;
    }

    public String toString(){
   return "Это автомобиль грузоподъемностью "+weight;
}}
