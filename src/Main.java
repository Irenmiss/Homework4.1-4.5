
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 4.1");
        int clientOS = 1;
        boolean iOS = clientOS == 0;
        if (iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 4.2");
        int clientOS1 = 0;
        int clientDeviceYear = 2010;
        if (clientOS1 == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 & clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS1 == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 4.3");
        int year = 1900;
        if (year % 4 == 0 && year % 100 !=0) {
            System.out.println("Год является високосным");
        } else if (year % 100 == 0 && year % 4 == 0 && year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

        System.out.println("Задание 4.4");
        int deliveryDistance1 = 120;
        int deliveryDays1 = 1;
        if (deliveryDistance1 <= 20) {
            System.out.println("Потребуется дней: 1");
        }
        else if (deliveryDistance1 > 20 && deliveryDistance1 <= 60) {
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance1 > 60 && deliveryDistance1 <= 100) {
            System.out.println("Потребуется дней: 3");
        }
        else {
            System.out.println("Доставка на расстояние более чем 100 км не осуществляется.");
        }

        System.out.println("Задание 4.5");
        int monthNumber = 15;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь, зима.");
                break;
            case 2:
                System.out.println("Февраль, зима.");
                break;
            case 3:
                System.out.println("Март, весна.");
                break;
            case 4:
                System.out.println("Апрель, весна.");
                break;
            case 5:
                System.out.println("Май, весна.");
                break;
            case 6:
                System.out.println("Июнь, лето.");
                break;
            case 7:
                System.out.println("Июль, лето.");
                break;
            case 8:
                System.out.println("Август, лето.");
                break;
            case 9:
                System.out.println("Сентябрь, осень.");
                break;
            case 10:
                System.out.println("Октябрь, осень.");
                break;
            case 11:
                System.out.println("Ноябрь, осень.");
                break;
            case 12:
                System.out.println("Декабрь, зима.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}