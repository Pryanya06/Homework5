public class Main {
    public static void main(String[] args) {


        int clientOS = 1;
        int clientDeviceYear = 2016;
        if (clientOS == 0) {
            System.out.println(" Установите версию приложения для IOS по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println (" Установите облегченную версию приложения для iOS по ссылке ");
            }
        } else {
            System.out.println(" Установите версию приложения для Android по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        int year = 2020;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            System.out.println(year + " это високосный год");
        } else
            System.out.println(year + " это не високосный год");



        int deliveryDistance = 60;
        if (deliveryDistance <=20) {
            System.out.println("Потребуется 1 день");
        } else  if (deliveryDistance <=60){
                System.out.println ("Потребуется 2 дня");
            } else if ( deliveryDistance <=100) {
            System.out.println ("Потребуется 3 дня");
        } else if (deliveryDistance >100) {
            System.out.println ("Доставки нет");
        }


        int monthNumber = 6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println( "Зима");
                break;
            case 3:
            case 4:
            case 5:
                    System.out.println( "Весна");
                    break;
            case 6:
            case 7:
            case 8:
                        System.out.println( "Лето");
                        break;
            case 9:
            case 10:
            case 11:
                            System.out.println( "Осень");
                            break;
            default:
                System.out.println( " Нет такого месяца");
        }

    }
}