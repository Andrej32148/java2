package ru.progwards.java1.lessons.interfaces2;



public class TestString {
    public static void print(ToString any){
        System.out.println(any.getString());
    }

    public static void main(String[] args) {
Cow cow=new Cow("Пеструшка", 350.0);
Duck duck=new Duck("Даша",3.0);
Hamster hamster=new Hamster("Поликарп",0.25);
Time time=new Time(1,12,55);
ComplexNum complexNum=new ComplexNum(22,5);
 print((ToString) cow);
 print((ToString) duck);
 print((ToString) hamster);
 print((ToString) time);
 print((ToString) complexNum);
    }

}
