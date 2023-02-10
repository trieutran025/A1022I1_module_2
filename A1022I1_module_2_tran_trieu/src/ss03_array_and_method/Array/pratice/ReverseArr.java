package ss03_array_and_method.Array.pratice;

import java.util.Scanner;

public class ReverseArr {
   public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size : ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ":");
            array[i] = input.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Element in Array :", "");
        for (int value : array) {
            System.out.print(value + "\t");
        }
        int temp = 0;
        for (int j = 0; j < array.length / 2; j++) {
            temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse Array:", "");
        for (int value : array) {
            System.out.print(value + "\t");
        }
    }
}
