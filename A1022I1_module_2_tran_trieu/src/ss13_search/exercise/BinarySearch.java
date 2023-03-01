package ss13_search.exercise;


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int[] myArr;

    public static int search(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                return search(array, middle + 1, right, value);
            } else {
                return search(array, left, middle - 1, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        myArr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ":");
            myArr[i] = sc.nextInt();
        }
        Arrays.sort(myArr);
        System.out.println("myArr after sort:");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + "\t");
        }
        System.out.print("\nEnter value need  find in myArr:");
        int value = sc.nextInt();
        System.out.print("Index of value in myArr:");
        System.out.print(search(myArr, 0, myArr.length - 1, value));
    }
}
