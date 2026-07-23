import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int [] array1 = new int [] {1, 2, 3};
        float [] array2 = new float[]{1.57f, 7.654f, 9.986f} ;
        short [] array3 = new short [3];
        // Задача 2
        for (int i = 0; i < array1.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array1[i]);
        }
        System.out.println("");
        for (int i = 0; i < array2.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array2[i]);
        }
        System.out.println("");
        for (int i = 0; i < array3.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array3[i]);
        }
        System.out.println("");
        // Задача 3
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i < array1.length - 1) {
                System.out.print(", ");
            }
            System.out.print(array1[i]);
        }
        System.out.println("");
        for (int i = array2.length - 1; i >= 0; i--) {
            if (i < array2.length - 1) {
                System.out.print(", ");
            }
            System.out.print(array2[i]);
        }
        System.out.println("");
        for (int i = array3.length - 1; i >= 0; i--) {
            if (i < array3.length - 1) {
                System.out.print(", ");
            }
            System.out.print(array3[i]);
        }
        System.out.println("");
         //Задача 4
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}