import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] inputArray1 = {10, 20, 30, 40, 50};
        float [] outputArray1 = new float [4];
        float sum = 0;
        int max = 0;
        int min = inputArray1[0];
        float average = 0;
        for(int element : inputArray1){
            sum = sum + element;
            outputArray1[0] = sum;
            if (max < element){
                max = element;
            }
            outputArray1[1] = max;
            if (min > element){
                min = element;
            }
            outputArray1[2] = min;
            average = sum / inputArray1.length;
            outputArray1[3] = average;
        }
        for (int element : inputArray1){
            System.out.println(element);
        }
        for (float element : outputArray1){
            System.out.println(element);
        }
        // Задача 2
        int[] inputArray2 = {1000, 2000, 3000, 4000, 5000};
        float [] outputArray2 = new float [5];
        int index = 0;
        for (int element : inputArray2){
            float tax = element * 0.13f;
            outputArray2[index] = tax;
            index++;
        }
        for (int element : inputArray2) {
            System.out.println(element);
        }
        for (float element : outputArray2) {
            System.out.println(element);
        }
        // Задача 3
        int[] inputArray3 = {3000, 2000, 8000, 4000, 6000};
        boolean [] outputArray3 = new boolean [5];
        int index1 = 0;
        for (int element : inputArray3){
                    if (element > 5000){
                        outputArray3[index1] = true;
                    } else {
                        outputArray3[index1] = false;
                    }
                    index1++;
        }
        for (int element : inputArray3) {
            System.out.println(element);
        }
        for (boolean element : outputArray3) {
            System.out.println(element);
        }
        // Задача 4
        int[] inputArray4 = {2000, 4000, 4000, 4000, 2000};
        boolean [] outputArray4 = new boolean [1];
        int index2 = 0;
        for (int element : inputArray4) {
            if (element < 0) {
                outputArray4[index2] = false;
                break;
            } else {
                outputArray4[index2] = true;
            }
        }
        for (int element : inputArray4) {
            System.out.println(element);
        }
        for (boolean element : outputArray4) {
            System.out.println(element);
        }
        // Задача 5
        int[] inputArray5 = {2000, -4000, 4000, 3000, 5000};
        int [] outputArray5 = new int [1];
        int month = 0;
        for (int element : inputArray5) {
            if (element > 0) {
                month += 1;
            }
        }
        outputArray5[0] = month;
        for (int element : inputArray5) {
            System.out.println(element);
        }
        for (int element : outputArray5) {
            System.out.println(element);
        }

    }
}