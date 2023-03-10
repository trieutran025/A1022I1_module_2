package ss03_array_and_method.Method.exercise;

import java.util.Scanner;

public class MaxArr2D {
    static double[][] myArr;
    public static void findMaxAndCoordinates(double arr[][]) {//Find value Max of matrix and coordinates
        int row = 0;
        int col = 0;
        double max = myArr[0][0];
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                if (myArr[i][j] > max) {
                    max = myArr[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }
        //Display Maximum Value and coordinates
        System.out.println("The largest matrix is : " + max + " coordinates " + "row : " + row + " column : " + col);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row Length:");
        int rowLength = sc.nextInt();//This is row length of myArr

        System.out.print("Enter column Length");
        int columnLength = sc.nextInt();//This is column of myArr
        //initialize array
        myArr = new double[rowLength][columnLength];
        //initialize values of matrix
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                System.out.print("Enter value element row " + (i + 1) + " col " + (j + 1) + " :");
                myArr[i][j] = sc.nextDouble();
            }
        }
        findMaxAndCoordinates(myArr);
    }
}
