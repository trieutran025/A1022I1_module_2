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
                throw new IllegalTriangleException(a, b, c);
            }
            if (a + b < c || a + c < b || b + c < a) {
                throw new IllegalTriangleException(a, b, c);
            }
            System.out.println("This is triangle!");
        } catch (InputMismatchException e) {
            System.out.println("Input value must be numbers!");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Something error!");
        } finally {
            System.out.println("This program is end!");
        }

    }
}
