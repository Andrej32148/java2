package ru.progwards.java1.lessons.classes1;

import ru.progwards.java1.lessons.inheritance.TimeZone;

public class Time {
    int hours;
    int minutes;
    int seconds;
    String hours1;
    String minutes1;
    String seconds1;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    public Time(int hours, int minutes) {
        this(hours, minutes, minutes);
    }
    public TimeZone getTimeZone(){
        return null;
    }

    public String toString() {

        if (hours < 10) {
            hours1 = "0" + hours;
        } else hours1 = String.valueOf(hours);
        if (minutes < 10) {
            minutes1 = "0" + minutes;
        } else minutes1 = String.valueOf(minutes);
        if (seconds < 10) {
            seconds1 = "0" + seconds;
        } else seconds1 = String.valueOf(seconds);
        return hours1 + ":" + minutes1 + ":" + seconds1;
    }
    public int toSeconds() {
        return hours * 60 * 60 + minutes * 60 + seconds;
    }
    public int secondsBetween(Time time) {
        int a = this.toSeconds() - time.toSeconds();
        if (a < 0) {
            a = -a;
        }
        return a;
    }

    public static void main(String[] args) {
        Time time = new Time(12, 2, 3);
        Time time1 = new Time(10, 5);
        System.out.println(time.toString());
        System.out.println(time1.secondsBetween(time));
    }
}
