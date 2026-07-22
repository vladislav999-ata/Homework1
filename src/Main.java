//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1,2
        byte clientOS = 0;
        short clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if(clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if(clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        // Задача 3
        int year = 2021;
        if ((year % 4 == 0 && year >= 1584 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + ", год является високосным");
        } else {
            System.out.println(year + "  год не является високосным");
        }
        // Задача 4
        byte deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("доставки нет");
        }
        // Задача 5
        byte monthNumber = 12;
        if (monthNumber > 12) {
            System.out.println("Некорректный номер месяца");
        } else {
            switch (monthNumber) {
                case 12, 1, 2:
                    System.out.println("принадлежит к сезону зима.");
                    break;
                case 3, 4, 5:
                    System.out.println("принадлежит к сезону весна.");
                    break;
                case 6, 7, 8:
                    System.out.println("принадлежит к сезону лето.");
                    break;
                case 9, 10, 11:
                    System.out.println("принадлежит к сезону осень.");
                    break;
            }
        }
    }
}