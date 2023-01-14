package Ss01_Intruduction_java.pratice;

import java.util.Scanner;

public class OperatorExpression {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);//Declare object Scanner
        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
