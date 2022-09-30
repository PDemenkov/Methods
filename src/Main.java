import java.time.LocalDate;

public class Main {

    public static void isleapYear(int x) { //Задание 1
        boolean leapYear = ((x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0));
        if (leapYear) {
            System.out.println(x + " Год является високосным");
        }else {
            System.out.println(x + " Не является високосным");
        }
    }

        public static void checkVersion (int clientOS, int currentYear, int clientDeviceYear){ //Задание 2
            if (clientDeviceYear<currentYear && clientOS == 1)
                System.out.println("Установите облегченную версиюя для Android");
            else if (clientDeviceYear<currentYear && clientOS ==0) {
                System.out.println("Установите облегченную версиюя для iOS");
            } else if (clientDeviceYear>currentYear && clientOS ==1 ) {
                System.out.println("Установите обычную версиюя для Android");
            } else if (clientDeviceYear>currentYear && clientOS ==0 ) {
                System.out.println("Установите обычную версиюя для iOS");
            }
        }

        public static void daysToDelivery(int deliveryDistance){  //Задание 3
            if (deliveryDistance <20){
                System.out.println("Потребуется дней: 1");
            } else if (deliveryDistance>=20 && deliveryDistance <60) {
                System.out.println("Потребуется дней: 2");
            } else if (deliveryDistance>=60 && deliveryDistance<100){
                System.out.println("Потребуется дней: 3");
            } else {
                System.out.println("Пока не доставляем");
            }
        }


    public static void main(String[] args) {
        int year = 2020;
        int deliveryDistance = 95;
        isleapYear(year); //Задание1
        int currentYear = LocalDate.now().getYear();
        int clientOS = 0;
        int clientDeviceYear = 2019;
        checkVersion(clientOS,currentYear,clientDeviceYear);
        daysToDelivery(deliveryDistance);
    }
}