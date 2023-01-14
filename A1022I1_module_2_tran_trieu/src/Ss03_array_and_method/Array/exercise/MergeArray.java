package ss03_ArrrayAndMethod_java.Exercise;

import java.util.Scanner;

public class MergeArray {
    static int myArrFirst[];
    static int myArrSecond[];
    static int myArrThird[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myArrFirst = new int[4];
        myArrSecond = new int[3];
        for (int i = 0; i < myArrFirst.length; i++) {
            System.out.print("Enter value the element " + i + " Of myArr1:");
            myArrFirst[i] = sc.nextInt();
        }
        System.out.println("Now Enter value element Arr2!");
        for (int i = 0; i < myArrSecond.length; i++) {
            System.out.print("Enter value the element " + i + " Of myArr2:");
            myArrSecond[i] = sc.nextInt();
        }
        int m = myArrFirst.length;//This is Length of myArr1
        int n = myArrSecond.length;//This is Length of myArr2
        myArrThird = new int[n + m];
        System.arraycopy(myArrFirst, 0, myArrThird, 0, m);
        System.arraycopy(myArrSecond, 0, myArrThird, m, n);
        for (int value : myArrThird) {
            System.out.print(value + "\t");
        }
    }
}
