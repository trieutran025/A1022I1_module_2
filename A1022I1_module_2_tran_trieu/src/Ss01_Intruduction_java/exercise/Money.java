package Ss01_Intruduction_java.exercise;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double VND = 23000;//Money of VietNam
        double USD;//Money of USA
        System.out.print("enter USD:");
        Scanner sc = new Scanner(System.in);
        USD = sc.nextDouble();
        double ChangeMoney = USD * 23000;
        System.out.println("Giá trị VND:"+ChangeMoney);
    }
}
