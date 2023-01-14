package Ss01_Intruduction_java.exercise;

import java.util.Scanner;

public class Communicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello : " + name);
    }
}
