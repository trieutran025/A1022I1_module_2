package Ss03_array_and_method.Method.exercise;

import java.util.Scanner;

public class MinArr {
    static int[] myArr;

    public static int findMindArr(int arr[]) {//Find min in Array
        int min = myArr[0];
        for (int i = 1; i < arr.length; i++) {
            if (myArr[i] < min)
                min = myArr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of myArr : ");
        int size = sc.nextInt();//This is size of myArr
        myArr = new int[size];
        //initialize the element values of myArr
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element value " + (i + 1) + ":");
            myArr[i] = sc.nextInt();
        }
        //Display the smallest value in the array
        int result = findMindArr(myArr);
        System.out.println("Value  min in Array : " + result);
    }
}
