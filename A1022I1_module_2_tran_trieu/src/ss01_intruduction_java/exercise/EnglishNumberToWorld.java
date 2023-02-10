package ss01_intruduction_java.exercise;

import java.util.Scanner;

public class EnglishNumberToWorld {
    static String Str = "";//Null

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        short number = sc.nextShort();
        if (number > 0 && number < 10) {
            switch (number) {
                case 1:
                    Str = "One";
                    break;
                case 2:
                    Str = "Two";
                    break;
                case 3:
                    Str = "Three";
                    break;
                case 4:
                    Str = "Four";
                    break;
                case 5:
                    Str = "Five";
                    break;
                case 6:
                    Str = "Six";
                    break;
                case 7:
                    Str = "Seven";
                    break;
                case 8:
                    Str = "Eight";
                    break;
                case 9:
                    Str = "Nine";
                    break;
            }
        } else if (number < 20 && number >= 10) {
            switch (number) {
                case 10:
                    Str = "Ten";
                    break;
                case 11:
                    Str = "Eleven";
                    break;
                case 12:
                    Str = "twelve";
                    break;
                case 13:
                    Str = "thirteen";
                    break;
                case 15:
                    Str = "fifteen";
                    break;
                case 16:
                    Str = "Sixteen";
                    break;
                case 17:
                    Str = "Seventeen";
                    break;
                case 18:
                    Str = "eighteen";
                    break;
                case 19:
                    Str = "nineteen";
                    break;
            }
        } else if (number >= 20 && number < 100) {
            switch (number / 10) {
                case 2:
                    Str = "Twenty";
                    break;
                case 3:
                    Str = "thirty";
                    break;
                case 4:
                    Str = "forty";
                    break;
                case 5:
                    Str = "fifty";
                    break;
                case 6:
                    Str = "Sixty";
                    break;
                case 7:
                    Str = "Seventy";
                    break;
                case 8:
                    Str = "Eighty";
                    break;
                case 9:
                    Str = "ninety";
                    break;
            }
            switch (number % 10) {
                case 1:
                    Str += " One";
                    break;
                case 2:
                    Str += " Two";
                    break;
                case 3:
                    Str += " Three";
                    break;
                case 4:
                    Str += " Four";
                    break;
                case 5:
                    Str += " Five";
                    break;
                case 6:
                    Str += " Six";
                    break;
                case 7:
                    Str += " Seven";
                    break;
                case 8:
                    Str += " Eight";
                    break;
                case 9:
                    Str += " Nine";
                    break;
            }
        } else if (number >= 100 & number <= 999) {
            switch (number / 100) {
                case 2:
                    Str = "Two hundred";
                    break;
                case 3:
                    Str = "Three hundred";
                    break;
                case 4:
                    Str = "Four hundred";
                    break;
                case 5:
                    Str = "Five hundred";
                    break;
                case 6:
                    Str = "Six hundred";
                    break;
                case 7:
                    Str = "Seven hundred";
                    break;
                case 8:
                    Str = "Eight hundred";
                    break;
                case 9:
                    Str = "Nine hundred";
                    break;
                default:
                    Str = "One hundred";
            }
            int temp = number / 10;
            switch (temp % 10) {
                case 2:
                    Str += " Twenty ";
                    break;
                case 3:
                    Str += " thirty ";
                    break;
                case 4:
                    Str += " forty ";
                    break;
                case 5:
                    Str += " fifty ";
                    break;
                case 6:
                    Str += " Sixty ";
                    break;
                case 7:
                    Str += " Seventy ";
                    break;
                case 8:
                    Str += " Eighty ";
                    break;
                case 9:
                    Str += " ninety ";
                    break;
            }
            switch (number % 10) {
                case 1:
                    Str += " One ";
                    break;
                case 2:
                    Str += " Two ";
                    break;
                case 3:
                    Str += " Three ";
                    break;
                case 4:
                    Str += " Four ";
                    break;
                case 5:
                    Str += " Five ";
                    break;
                case 6:
                    Str += " Six ";
                    break;
                case 7:
                    Str += " Seven ";
                    break;
                case 8:
                    Str += " Eight ";
                    break;
                case 9:
                    Str += " Nine ";
                    break;
            }
        }
        System.out.printf(Str);
    }
}
