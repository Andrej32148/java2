package ru.progwards.java1.lessons.date;

public class CalendarPrint {

        public static void printMonth(int month, int year) {
            // Проверка на допустимые значения месяца (1-12) и года
            if (month < 1 || month > 12 || year < 0) {
                System.out.println("Ошибка: Недопустимые значения месяца и/или года.");
                return;
            }

            // Определение названия месяца
            String[] monthNames = {"", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
            String monthName = monthNames[month];

            // Определение количества дней в месяце
            int daysInMonth;
            if (month == 2) {
                // Проверка на високосный год
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30;
            } else {
                daysInMonth = 31;
            }

            // Определение первого дня недели месяца (0 - воскресенье, 1 - понедельник, и т.д.)
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.set(year, month - 1, 1);
            int firstDayOfWeek = calendar.get(java.util.Calendar.DAY_OF_WEEK) - 1;

            // Вывод года и названия месяца
            System.out.println(year + " " + monthName);

            // Вывод дней недели
            System.out.println("пн вт ср чт пт сб вс");

            // Вывод календаря
            for (int i = 0; i < firstDayOfWeek; i++) {
                System.out.print("   "); // Вывод пробелов перед первым днем месяца
            }

            for (int i = 1; i <= daysInMonth; i++) {
                System.out.printf("%2d ", i); // Вывод чисел месяца с дополнительным пробелом спереди, если число однозначное
                if ((firstDayOfWeek + i) % 7 == 0) {
                    System.out.println(); // Переход на новую строку после каждой недели
                }
            }

            System.out.println(); // Переход на новую строку после вывода календаря
        }

        public static void main(String[] args) {
            // Пример вызова метода printMonth() для месяца февраля 2022 года
            printMonth(2, 2022);
        }
    }
