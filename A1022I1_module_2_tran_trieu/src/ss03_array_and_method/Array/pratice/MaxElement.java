package ss03_array_and_method.Array.pratice;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        for (int value : array) {
            System.out.print(value + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("\nThe largest property value in the list is " + max + ",at position " + index);
    }
}
