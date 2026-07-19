//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int a = 1000000;
        byte b = 120;
        short c = 32760;
        long d = 12312321311L;
        float w = 12.12f;
        double t = 123123.123123;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной w с типом float равно " + w);
        System.out.println("Значение переменной t с типом double равно " + t);
        // Задача 2
        byte b1 = 67;
        short a1 = 27897;
        short c1 = -159;
        short d1 = 569;
        float w1 = 2.786f;
        long t1 = 987678965549L;
        float s1 = 27.12f;
        // Задача 3
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short papers = 480;
        int totalStudents = teacher1 + teacher2 + teacher3;
        int calculate = papers / totalStudents;
        System.out.println("На каждого ученика рассчитано " + calculate + " листов бумаги");
        // Задача 4
        byte min2 = 16;
        int min = min2 / 2;
        int min20 = min * 20;
        int hour = min * 60;
        int day = hour * 24;
        int day3 = day * 3;
        int month = day * 30;
        System.out.println("За 2 минуты машина произвела " + min2 + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + month + " штук бутылок");
        // Задача 5
        byte dye = 120;
        byte white = 2;
        byte brown = 4;
        int schoolClass = dye / (white + brown);
        int totalWhite = schoolClass * white;
        int totalBrown = schoolClass * brown;
        System.out.println("В школе, где " + schoolClass + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
        // Задача 6
        byte bananaCaloric = 80;
        byte eggCaloric = 70;
        byte iceCreamCaloric = 100;
        byte milkCaloric = 105;
        byte banana = 5;
        byte egg = 4;
        byte iceCream = 2;
        short milk = 200;
        float milk1Caloric = milkCaloric / 100.0f;
        int breakfastGram = (int) ((banana * bananaCaloric) + (egg * eggCaloric) + (iceCream * iceCreamCaloric) + (milk * milk1Caloric));
        System.out.println("breakfastGram = " + breakfastGram +  " gram");
        float breakfastKg = breakfastGram / 1000.0f;
        System.out.println("breakfastKg = " + breakfastKg +  " kg");
        //Задача 7
        short diet1 = 250;
        short diet2 = 500;
        byte weight = 7;
        short weightGram = (short) (weight * 1000);
        byte result1 = (byte) (weightGram / diet1);
        byte result2 = (byte) (weightGram / diet2);
        System.out.println(result1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм" );
        System.out.println(result2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм" );
        byte average = (byte)((result1 + result2) / 2);
        System.out.println(average + " может потребоваться дней в среднем, чтобы добиться результата похудения");
        //Задача 8
        int worker1 = 67760;
        int worker2 = 83690;
        int worker3 = 76230;
        short differenceWorker1 = (short)((worker1 * 10) / 100);
        short differenceWorker2 = (short)((worker2 * 10) / 100);
        short differenceWorker3 = (short)((worker3 * 10) / 100);
        int  worker1up = worker1 + differenceWorker1;
        int  worker2up = worker2 + differenceWorker1;
        int  worker3up = worker3 + differenceWorker1;
        System.out.println("Маша теперь получает " + worker1up + " рублей. Годовой доход вырос на " + differenceWorker1 + " рублей");
        System.out.println("Денис теперь получает " + worker2up + " рублей. Годовой доход вырос на " + differenceWorker2 + " рублей");
        System.out.println("Кристина теперь получает " + worker3up + " рублей. Годовой доход вырос на " + differenceWorker3 + " рублей");
    }}