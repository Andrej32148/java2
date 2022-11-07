package ru.progwards.java1.lessons.inheritance;

public class Hamster extends Animal{
    public Hamster(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "рум-хрум-хрум" ;
    }

    @Override
    public String kind() {
        return "хомяк";
    }
}
