//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println( + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        // Задача 2
        dog = dog + 2;
        cat = cat + 2;
        paper = paper + 2;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        // Задача 3
        System.out.println("dog = " + (dog - 3.5));
        System.out.println("cat = " + (cat - 1.6));
        System.out.println("paper = " + (paper - 7639));
        // Задача 4
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
        // Задача 5
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
        // Задача 6
        var weight1 = 78.2;
        var weight2 = 82.7;
        var amount = weight1 + weight2;
        var difference = weight2 - weight1;
        System.out.println("amount = " + amount);
        System.out.println("difference = " + difference);
        //Задача 7
        var remnant =  weight2 % weight1;
        System.out.println("remnant = " + remnant);
        //Задача 8
        var watchesCompany = 640;
        var workers = watchesCompany / 8;
        System.out.println("Всего работников в компании " + workers +  " — человек");
        workers = workers + 94;
        watchesCompany = workers * 8;
        System.out.println("Если в компании работает " + workers + " человека, то всего " + watchesCompany + " часов работы может быть поделено между сотрудниками");
    }
    }
