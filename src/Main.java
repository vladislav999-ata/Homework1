import java.time.LocalDate;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void checkYear(int year) {
        if ((year % 4 == 0 && year >= 1584 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void checkDevice(byte clientOS, int currentYear) {
        if (clientOS == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int checkDistance(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        //Задача 1
        int year = 2024;
        checkYear(year);
        // Задача 2
        byte clientOS = 0;
        int currentYear = LocalDate.now().getYear();
        checkDevice(clientOS, currentYear);
        // Задача 3
        int deliveryDistance = 95;
        int day = checkDistance(deliveryDistance);
        if (day > 0) {
            System.out.println("Потребуется дней: " + day);
        } else System.out.println("доставки нет");
    }
}