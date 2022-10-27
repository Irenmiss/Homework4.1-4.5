public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 4.1");
        int clientOS = 0;
        boolean iOS = clientOS == 0;
        if (iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание 4.2");
        int clientOS1 = 1;
        int clientDeviceYear = 2016;
        if (clientOS1 == 0 && clientDeviceYear == 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 & clientDeviceYear != 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS1 !=0 && clientDeviceYear == 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 !=0 && clientDeviceYear != 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание 4.3");
        int year = 1600;
        double divisionOnFour = year % 4;
        double divisionOnHundred = year % 100;
        double divisionOnFourHundred = year % 400;
        boolean remainderFourIsNull = divisionOnFour == 0;
        boolean remainderHundredIdNotNull = divisionOnHundred != 0;
        boolean remainderFourHundred = divisionOnFourHundred == 0;
        if (remainderFourIsNull && remainderHundredIdNotNull) {
            System.out.println("Год является високосным");
        } else if (divisionOnHundred == 0 && divisionOnFour == 0 && divisionOnFourHundred ==0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
        System.out.println("Задание 4.4");
        int deliveryDistance = 1000;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
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
