package ru.progwards.java1.lessons.interfaces2;

public class TimeZone {
    int hours;
    int minutes;

    public TimeZone(int hours) {
        this.hours = hours;
        minutes=0;
    }

    public TimeZone(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

}
