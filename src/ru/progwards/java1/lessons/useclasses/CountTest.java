package ru.progwards.java1.lessons.useclasses;



public class CountTest {
    Count count;

    public CountTest(Count count) {
        this.count = count;
    }


    public static void testInc(int count){
        Count count1=new Count();
        if(count<=0){
            System.out.println("тест inc окончен");
            return ;
        }
        for (int i = 0; i < count; i++) {
         count1.inc();
            System.out.print(count1.getCount()+" ");

        }
        System.out.println();
        System.out.println("тест inc окончен");


    }
    public static void testDec(int count){
        Count count1=new Count(count);
        boolean a= count1.dec();
        if (a){

            System.out.println("count равен 0");
            return;

        }

        for (int i = count; i>0 ; i--) {
            System.out.print(count1.getCount() + " ");
        }



        System.out.println();
        System.out.println("тест dec окончен");
    }



    public static void main(String[] args) {
        testInc(7);
        testInc(0);
        testInc(-1);
        testDec(9);
        testDec(0);
        testDec(-5);
    }
    }
