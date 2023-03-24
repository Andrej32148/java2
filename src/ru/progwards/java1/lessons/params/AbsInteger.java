package ru.progwards.java1.lessons.params;

public abstract class AbsInteger {
    abstract public String toString();
    abstract public int getValue();
    public static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        int sum = num1.getValue() + num2.getValue();
        if (sum >= Byte.MIN_VALUE && sum <= Byte.MAX_VALUE) {
            return new ByteInteger((byte) sum);
        } else if (sum >= Short.MIN_VALUE && sum <= Short.MAX_VALUE) {
            return new ShortInteger((short) sum);
        } else {
            return new IntInteger(sum);
        }
    }
}
