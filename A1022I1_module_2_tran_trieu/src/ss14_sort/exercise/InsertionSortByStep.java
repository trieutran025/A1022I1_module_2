package ss14_sort.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    //codes below here
    public static void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k = i - 1;
            for (; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
                System.out.println("list[" + (k + 1) + "]=" + "list[" + k + "]");
            }
            list[k + 1] = currentElement;
            System.out.println("list[" + (k + 1) + "]=" + currentElement);
            System.out.println("-----------------------------");
        }
        System.out.print("List after the sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}
