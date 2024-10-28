public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var taskOne = ("Задача №1");
        System.out.println(taskOne);

        int clientOS = 0;
        boolean clientOsIos = clientOS == 0;
        boolean clientOsAndroid = clientOS == 1;
        if (clientOsIos) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOsAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        var taskTwo = ("Задача №2");
        System.out.println(taskTwo);

        int clientDeviceYear = 2014;
        boolean clientDevice = clientDeviceYear < 2015;
        if (clientDevice && clientOsIos) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDevice && clientOsAndroid) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        var taskThree = ("Задача №3");
        System.out.println(taskThree);
        int year = 1580;
        boolean leapYear = year % 400 == 0 || year % 4 == 0;
        boolean notLeapYear = year % 100 != 0;
        if (year < 1584) {
            System.out.println("Високосный год ввели после этого года");
        } else if (leapYear) {
            System.out.println(year + " год является високосным");
        } else if (notLeapYear) {
            System.out.println(year + " год не является високосным");

        }

        var taskFour = ("Задача №4");
        System.out.println(taskFour);
        int deliveryDistance = 95;
        int day = 1;
        boolean moreThanHundred = deliveryDistance > 100;
        if (deliveryDistance <= 20) {
            day = day + 0;
            System.out.println("Потребуется " + day + " день доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = day + 1;
            System.out.println("Потребуется " + day + " дня доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = day + 2;
            System.out.println("Потребуется " + day + " дня доставки");
        } else if (moreThanHundred) {
            System.out.println("Доставка не осуществляется");
        }
        var taskFive = ("Задача №5");
        System.out.println(taskFive);
        int monthNumber1 = 6;
        switch (monthNumber1) {
            case 1, 2, 12 -> System.out.printf("Зима");
            case 3, 4, 5 -> System.out.printf("Весна");
            case 6, 7, 8 -> System.out.printf("Лето");
            case 9, 10, 11 -> System.out.printf("Осень");
            default -> System.out.printf("Некорректность введенного значения");
        }


    }



}

