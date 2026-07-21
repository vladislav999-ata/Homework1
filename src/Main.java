//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
        // Задача 2
        byte temp = -10;
        if (temp > 5){
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        else{
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        // Задача 3
        short speed = 200;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ",  придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }
        // Задача 4
        byte age1 = 26;
        if (age1 >= 2 && age1 <= 6 ) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 17){
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24){
            System.out.println("Если возраст человека равен " + age1 + ", то его место в университете");
        }
        if (age1 > 24){
            System.out.println("Если возраст человека равен " + age1 + ", ему пора ходить на работу");
        }
        // Задача 5
        byte age2 = 14;
        if (age2 < 5){
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе");
        }
        else if (age2 >= 5 && age2 <= 14){
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age2 + ", то он может кататься без сопровождения взрослого");
        }
        // Задача 6
        int passenger = 102;
        if (passenger <= 60){
            System.out.println("в вагоне есть, сидячее и стоячее место");
        }
        else if (passenger > 60 && passenger <= 102 ) {
            System.out.println("в вагоне есть стоячее место");
        }
        else {
            System.out.println("в вагоне мест нет");
        }
        //Задача 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println(one + " наибольшее");
        }
        else if (two > one  && two > three){
            System.out.println(two + " наибольшее");
        }
        else {
            System.out.println(three + " наибольшее");
        }
    }
}