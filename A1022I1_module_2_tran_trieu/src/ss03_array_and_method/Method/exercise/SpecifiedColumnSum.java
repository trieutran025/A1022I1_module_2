package ss03_array_and_method.Method.exercise;

import java.util.Scanner;

public class SpecifiedColumnSum {
    static double[][] myArr;

    public static double columnSum(double[][] arr, int index) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][index];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row length: ");
        int rowLength = sc.nextInt();
        System.out.print("Enter col length: ");
        int colLength = sc.nextInt();
        myArr = new double[rowLength][colLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                System.out.print("Enter element value row " + i + " col " + j + ":");
                myArr[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                System.out.print(myArr[i][j] + " \t ");
            }
            System.out.println("");
        }
        System.out.println("Enter the column you want to sum :");
        int indexCol = sc.nextInt();
        System.out.println("Sum of " + indexCol + " = " + columnSum(myArr, indexCol));
    }
}
