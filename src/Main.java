//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int firstFriday = 1;
        for (int i = 1; i <= 31; i++ ){
            if (firstFriday == i){
                System.out.println("Сегодня пятница, " + i +"-е число. Необходимо подготовить отчет");
                firstFriday = firstFriday + 7;
            }
        }
        // Задача 2 do-while
        int distance = 0;
        int finish = 42195;
        int run = 42195;
        do {
            System.out.println("Держитесь! Осталось " + run + " метров");
            distance += 500;
            run = finish - distance;
        }while (distance < finish);
        // Задача 2 for
        for (int i = 42195; i > 0; i -= 500){
            System.out.println("Держитесь! Осталось " + i + " метров");
        }
         //Задача 3 while
        int budget = 400;
        int day = 1;
        while (budget > 100){
            day = day + 1;
            if (day % 5 == 0){
                continue;
            }
            budget -= 100;
        }
        System.out.println( "дней доступно: " + day);
         //Задача 3 for
        int budget1 = 400;
        int day1 = 1;
        for (int i = budget1; i > 100;){
            day1 += 1;
            if (day1 % 5 == 0){
                continue;
            }
            i -= 100;
        }
        System.out.println("дней доступно: " + day1);
         //Задача 4
        int month = 0;
        int total = 0;
        while(true){
            month += 1;
            total += 15000;
            if(month % 6 == 0){
                total = (int)(total * 1.07);
            }
            System.out.println("текущий номер месяца: " + month + " текущая сумма накоплений: " + total);
            if(total >= 12_000_000){
                break;
            }
        }

         //Задача 5
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while(charge < 100 && overheats <= 3){
            minute += 1;
            charge += 2;
            if (minute % 10 == 0){
                overheats += 1;
                minute += 2;
                continue;
            }
            if (overheats > 3) {
                break;
            }
        }
            System.out.println("Время зарядки составило " + minute + " минуты");
    }
}