package ss12_collection_framework.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> myStack = new Stack<>();
        Queue<String> myQueue = new LinkedList<>();
        String str = sc.nextLine();
        String[] temp = str.split("");
        for (int i = 0; i < temp.length; i++) {
            myStack.push(temp[i]);
            myQueue.add(temp[i]);
        }
        boolean result = true;
        while (!(myStack.empty())) {
            if (!myStack.pop().equals(myQueue.poll())) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("This is Palindrome");
        } else {
            System.out.println("This is not Palindrome");
        }
    }
}
