//Take 10 integer inputs from user and store them in an array and print them on screen.

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        int array1[] = new int[10];
        int i;
        for (i = 0; i < array1.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the value");
            array1[i] = scanner.nextInt();
        }
        for (i = 0; i < array1.length; i++) {
            System.out.println("The value of array1[" + i + "] is " + array1[i]);

        }
    }
}

