package ss13_search.exercise;

import java.util.Arrays;

public class BinarySearch {
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
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(search(myArray, 0, myArray.length - 1, 5));
        System.out.println(search(myArray, 0, myArray.length - 1, 1));
        System.out.println(search(myArray, 0, myArray.length - 1, 10));
        System.out.println(search(myArray, 0, myArray.length - 1, 21));
    }
}
