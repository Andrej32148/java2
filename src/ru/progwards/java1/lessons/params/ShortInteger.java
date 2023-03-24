package ru.progwards.java1.lessons.params;

public class ShortInteger extends AbsInteger{
    private short value;
    public ShortInteger(short value) {
        this.value = value;
    }
    public String toString() {
        return Short.toString(value);
    }
    public int getValue() {
        return value;
    }

}
