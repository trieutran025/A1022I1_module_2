package Ss03_array_and_method.Array.exercise;

import java.util.Scanner;

public class MergeArray {
    static int myArrFirst[];
    static int myArrSecond[];
    static int myArrMerged[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myArrFirst = new int[4];
        myArrSecond = new int[3];
        for (int i = 0; i < myArrFirst.length; i++) {
            System.out.print("Enter value the element " + i + " Of myArrFirst:");
            myArrFirst[i] = sc.nextInt();
        }
        System.out.println("Now Enter value element ArrSecond!");
        for (int i = 0; i < myArrSecond.length; i++) {
            System.out.print("Enter value the element " + i + " Of myArrSecond:");
            myArrSecond[i] = sc.nextInt();
        }
        int m = myArrFirst.length;//This is Length of myArrFirst
        int n = myArrSecond.length;//This is Length of myArrSecond
        myArrMerged = new int[n + m];
        System.arraycopy(myArrFirst, 0, myArrMerged, 0, m);
        System.arraycopy(myArrSecond, 0, myArrMerged, m, n);
        for (int value : myArrMerged) {
            System.out.print(value + "\t");
        }
    }
}
