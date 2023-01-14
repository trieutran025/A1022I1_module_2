package Ss01_Intruduction_java.exercise;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double VND = 23000;//Money of VietNam
        double USD;//Money of USA
        System.out.println("enter USD : ");
        USD = sc.nextDouble();
        double changeMoney = USD * 23e3;
        System.out.println("Giá trị VND :"+changeMoney);
    }
}
