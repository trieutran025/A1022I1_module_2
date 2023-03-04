package ss15_exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter triangle sides :");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a < 0 || b < 0 || c < 0) {
                throw new InputMismatchException();
            }
            if (a + b < c || a + c < b || b + c < a) {
                throw new IllegalTriangleException();
            }
            System.out.println("This is triangle ");
        } catch (InputMismatchException e) {
            System.out.println("Do not enter negative numbers");
        } catch (IllegalTriangleException e) {
            System.out.println("The sum of any two sides must be greater than the other");
        }

    }
}
