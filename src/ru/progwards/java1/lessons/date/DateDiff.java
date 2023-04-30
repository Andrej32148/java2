package ru.progwards.java1.lessons.date;

import java.util.Calendar;
import java.util.Date;

public class DateDiff {
    public static void timeBetween(Date date1, Date date2) {
        long diffInMillis = date2.getTime() - date1.getTime(); // Вычисляем разницу в миллисекундах

        // Количество миллисекунд в одной минуте, часе, дне и году
        long millisecondsPerMinute = 60 * 1000;
        long millisecondsPerHour = 60 * millisecondsPerMinute;
        long millisecondsPerDay = 24 * millisecondsPerHour;
        long millisecondsPerYear = 365 * millisecondsPerDay;

        // Вычисляем количество лет, месяцев, дней, минут, секунд и миллисекунд
        long years = diffInMillis / millisecondsPerYear;
        diffInMillis %= millisecondsPerYear;
        long months = diffInMillis / (30 * millisecondsPerDay); // Приближенное значение месяца в 30 дней
        diffInMillis %= 30 * millisecondsPerDay;
        long days = diffInMillis / millisecondsPerDay;
        diffInMillis %= millisecondsPerDay;
        long hours = diffInMillis / millisecondsPerHour;
        diffInMillis %= millisecondsPerHour;
        long minutes = diffInMillis / millisecondsPerMinute;
        diffInMillis %= millisecondsPerMinute;
        long seconds = diffInMillis / 1000;

        // Выводим результат на консоль
        System.out.printf("Между %s и %s: %d лет, %d месяцев, %d дней, %d минут, %d секунд, %d миллисекунд\n",
                date1, date2, years, months, days, hours, minutes, seconds, diffInMillis);
    }

    public static void timeToBirthday(Date now, Date birthday) {
        // Получаем текущий год
        int currentYear = now.getYear() + 1900;
        // Получаем год дня рождения
        int birthYear = birthday.getYear() + 1900;
        // Если текущая дата после дня рождения в текущем году, то прибавляем 1 год
        if (now.after(birthday)) {
            birthYear = currentYear + 1;
        }

        // Создаем дату дня рождения в текущем году
        Date nextBirthday = new Date(birthYear - 1900, birthday.getMonth(), birthday.getDate());
        // Вычисляем разницу между текущей датой и днем рождения
        long timeDifference = nextBirthday.getTime() - now.getTime();

        // Вычисляем количество миллисекунд, секунд, минут, дней и месяцев
        long milliseconds = timeDifference % 1000;
        long seconds = (timeDifference / 1000) % 60;
        long minutes = (timeDifference / (1000 * 60)) % 60;
        long hours = (timeDifference / (1000 * 60 * 60)) % 24;
        long days = (timeDifference / (1000 * 60 * 60 * 24)) % 30; // Возможно приближенное значение месяца
        long months = (timeDifference / (1000 * 60 * 60 * 24 * 30)); // Возможно приближенное значение месяца

        // Выводим результат на консоль
        System.out.println("До дня рождения " + months + " месяцев, " + days + " дней, " +
                hours + " часов, " + minutes + " минут, " + seconds + " секунд, " + milliseconds + " миллисекунд");
    }

    public static void main(String[] args) {
        Date d=new Date(1983, Calendar.AUGUST,15,17,55,37);
        Date a=new Date(2000,8,9,8,8,9);
        timeBetween(d,a);
    }
}
