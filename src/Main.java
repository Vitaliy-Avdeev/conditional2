public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var taskOne = ("Задача №1, №2");
        System.out.println(taskOne);

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015) if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        var taskThree = ("Задача №3");
        System.out.println(taskThree);
        int year = 2020;
        boolean leapYear = year % 400 == 0 || year % 4 == 0;
        boolean notLeapYear = year % 100 != 0;
        if (year < 1584) {
            System.out.println("");
        } else if (leapYear) {
            System.out.println(year + " год является високосным");
        } else if (notLeapYear) {
            System.out.println(year + " год не является високосным");

        }

        var taskFour = ("Задача №4");
        System.out.println(taskFour);
        int deliveryDistance = 95;
        int twenty = 1;
        int twentySixty = 2;
        int sixtyOneHundred = 3;
        boolean moreThanHundred = deliveryDistance > 100;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется " + twenty + " день доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется " + twentySixty + " дня доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется " + sixtyOneHundred + " дня доставки");
        } else if (moreThanHundred) {
            System.out.println("Доставка не осуществляется");
        }
        var taskFive = ("Задача №5");
        System.out.println(taskFive);
        int monthNumber = 12;
        String monthName = switch (monthNumber) {
            case 1 -> "Январь - зима";
            case 2 -> "Февраль - зима";
            case 3 -> "Март - весна";
            case 4 -> "Апрель - весна";
            case 5 -> "Май - весна";
            case 6 -> "Июнь - лето";
            case 7 -> "Июль - лето";
            case 8 -> "Август - лето";
            case 9 -> "Сентябрь - осень";
            case 10 -> "Октябрь - осень";
            case 11 -> "Ноябрь - осень";
            case 12 -> "Декабрь - зима";
            default -> "";
        };
        System.out.println(monthName);

    }
}