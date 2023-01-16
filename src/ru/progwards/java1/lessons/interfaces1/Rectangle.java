package ru.progwards.java1.lessons.interfaces1;

public class Rectangle implements Area{
    private double length;
    private double width;

    Rectangle(double width, double length){
        this.length=length;
        this.width=width;
    }

    @Override
    public double getArea() {
        return width*length;
    }
}
