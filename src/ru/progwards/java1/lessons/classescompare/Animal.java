package ru.progwards.java1.lessons.classescompare;

public abstract class Animal {
    private String name;
    private Double weight;

    public enum FoodKind {
        HAY,
        CORN,
    }

    abstract public FoodKind getFoodKind();

    public Double getWeight() {
        return weight;
    }

    abstract public double getFoodCoeff();

    public double calculateFoodWeight() {
        return weight * getFoodCoeff();
    }

    public double calculateFoodPrice() {
        double a=0;
        if (getFoodKind() == FoodKind.HAY) {
             a=calculateFoodWeight() * 2.00;

        }
        if (getFoodKind() == FoodKind.CORN) {
             a=calculateFoodWeight() * 15.00;
        }
        return a;
    }
    public Animal(String name) {
            this.name = name;
        }
        public abstract String kind ();

        public abstract String say ();

        public String toString () {
            return "Это " + kind() + " " + name + " ";

        }

        public void setWeight ( double weight){
            this.weight = weight;
        }

        int compareTo (Animal animal){
            return weight.compareTo(animal.weight);
        }

        public boolean equals (Animal o){
            return name.equals(o.name) & weight.equals(o.weight) & kind().equals(o.kind());
        }

    }
