package Ss03_array_and_method.Array.pratice;

import java.util.Scanner;

public class ElementInArray {
    public static void main(String[] args) {
        String[] student = {"Christan", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name's student:");
        String name = input.nextLine();
        boolean isExits = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(name)) {
                System.out.println("Position of the student in the list" + name + "is:" +(i + 1));
                isExits=true;
                break;
            }
        }
        if(!isExits){
            System.out.println("Not found"+name+" in the list.");
        }
    }
}
