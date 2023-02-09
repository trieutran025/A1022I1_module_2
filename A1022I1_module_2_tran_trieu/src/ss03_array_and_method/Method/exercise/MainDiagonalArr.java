package Ss03_array_and_method.Method.exercise;

import java.util.Scanner;

public class MainDiagonalArr {
    static int[][] myArr;

    public static int sumMainDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        myArr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter element value row " + i + " col " + j + " : ");
                myArr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <myArr.length ; i++) {
            for (int j = 0; j <myArr[i].length; j++) {
                System.out.print(myArr[i][j]+"\t");
            }
            System.out.println("");
        }
        int result =sumMainDiagonal(myArr);
        System.out.println("Sum main diagonal :"+result);
    }
}
