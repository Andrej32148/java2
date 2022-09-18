package ru.progwards.java1.lessons.cycles;

public class DigitCheck {
    public static boolean containsDigit(int number, int digit){
String s=String.valueOf(digit);
String a=String.valueOf(number);
        for (int i = 0; i <s.length(); i++) {
            if(a.charAt(i)==s.charAt(0)) {
                return true;
            }

        }
        return false;
}

    public static void main(String[] args) {
        System.out.println(containsDigit(589,5));
    }}