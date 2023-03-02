package ss14_sort.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k = i - 1;
            for (; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = scanner.nextInt();
        int[] myList = new int[size];
        for (int i = 0; i < myList.length; i++) {
            System.out.print("Enter element myList[" + i + "]:");
            myList[i] = scanner.nextInt();
        }
        insertionSort(myList);
        System.out.print("myList after sort:" + Arrays.toString(myList));
    }
}
