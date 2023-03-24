package ru.progwards.java1.lessons.params;

public class ByteInteger extends AbsInteger{
    private byte value;
    public ByteInteger(byte value) {
        this.value = value;
    }
    public String toString() {
        return Byte.toString(value);
    }
    public int getValue() {
        return value;
    }
}
