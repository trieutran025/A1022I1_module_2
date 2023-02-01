package Ss03_array_and_method.Array.exercise;

import java.util.Scanner;

public class AddArr {
    static int myArrFist[];
    static int myArrAdded[];//Array will add number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length Array:");
        int n = sc.nextInt();//This is length myArr
        myArrFist = new int[n];
        for (int i = 0; i < myArrFist.length; i++) {
            System.out.print("Enter value element" + i + ":");
            myArrFist[i] = sc.nextInt();
        }
        System.out.print("Enter number Add in Array:");
        int x = sc.nextInt();
        System.out.println("Enter index :");
        int index = sc.nextInt();
        if (index <= 1 || index >= args.length - 1) {
            System.out.println("X Don't Add in myArr");
        } else {
            myArrAdded = new int[myArrFist.length + 1];
            System.arraycopy(myArrFist, 0, myArrAdded, 0, myArrFist.length);
            int i = 0;
            while (i < myArrAdded.length) {
                if (i == index) {
                    myArrAdded[i] = x;
                    while (i < myArrAdded.length - 1) {
                        myArrAdded[i + 1] = myArrFist[i];
                        i++;
                    }
                }
                i++;
            }
            for (int value : myArrAdded) {
                System.out.print(value + "\t");
            }
        }
    }
}
