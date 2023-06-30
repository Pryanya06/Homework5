public class Main {
    public static void main(String[] args) {


        int clientOS = 1;
        int clientDeviceYear = 2016;
        if (clientOS == 0) {
            System.out.println(" Установите версию приложения для IOS по ссылке");
            if ( clientDeviceYear <=2015) {
                System.out.println( " Установите облегченную версию приложения для iOS по ссылке ");
            }
        } else {
            System.out.println(" Установите версию приложения для Android по ссылке");
            if (clientDeviceYear <=2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        int year = 2021;



    }
}