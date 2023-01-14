package ss03_ArrrayAndMethod_java.Exercise;

import java.util.Scanner;

public class RemoveArr {
    static int myArr[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length Array:");
        int N = sc.nextInt();//this is Length Array
        myArr = new int[N];
        for (int i = 0; i < myArr.length; i++) {
            System.out.print("Enter value element " + i + ":");
            myArr[i] = sc.nextInt();
        }
        System.out.print("Enter index Array Remove:");
        int index = sc.nextInt();//
        int i = 0;
        while (i < myArr.length) {
            if (i == index) {
                while (i < myArr.length - 1) {
                    myArr[i] = myArr[i + 1];
                    i++;
                }
                myArr[myArr.length - 1] = 0;
                break;
            } else
                i++;
        }
        for (int value : myArr) {
            System.out.print(value + "\t");
        }
    }
}

