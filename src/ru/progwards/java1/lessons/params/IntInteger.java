package ru.progwards.java1.lessons.params;

public class IntInteger extends AbsInteger{
    private int value;
    public IntInteger(int value) {
        this.value = value;
    }
    public String toString() {
        return Integer.toString(value);
    }
    public int getValue() {
        return value;
    }
}
