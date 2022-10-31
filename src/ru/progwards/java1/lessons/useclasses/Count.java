package ru.progwards.java1.lessons.useclasses;

public class Count {
    int count=0;

    public Count() {
    }

    public Count(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void inc() {
        count++;
    }

    public boolean dec() {
        count--;
        return count <= 0;
    }

    public static void main(String[] args) {
        Count count1 = new Count(10);
        for (int i = count1.getCount(); i > 0; i--) {
           boolean a= count1.dec();
            System.out.println(count1.getCount());
            if (a) {
                System.out.println("count равен 0");
                return;
            }
        }


    }
}

