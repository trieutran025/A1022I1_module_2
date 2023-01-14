package ss03_ArrrayAndMethod_java.exercise;

import java.util.Scanner;

public class AddArr {
    static int myArr[];
    static int myArr1[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length Array:");
        int n = sc.nextInt();//This is length myArr
        myArr = new int[n];
        for (int i = 0; i < myArr.length; i++) {
            System.out.print("Enter value element" + i + ":");
            myArr[i] = sc.nextInt();
        }
        System.out.print("Enter number Add in Array:");
        int x = sc.nextInt();
        System.out.println("Enter index :");
        int index = sc.nextInt();
        if (index <= 1 && index >= args.length - 1) {
            System.out.println("X Don't Add in myArr");
        } else {
            myArr1 = new int[myArr.length + 1];
            System.arraycopy(myArr, 0, myArr1, 0, myArr.length);
            int i = 0;
            while (i < myArr1.length) {
                if (i == index) {
                    myArr1[i] = x;
                    while (i < myArr1.length - 1) {
                        myArr1[i + 1] = myArr[i];
                        i++;
                    }
                }
                i++;
            }
        }
        for (int value : myArr1) {
            System.out.print(value + "\t");
        }
    }
}
