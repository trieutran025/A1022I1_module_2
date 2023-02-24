package ss11_generic_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class ReserveStack {
    static int arrInt[];
    static String arrStr[];

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n:");
//        int n = sc.nextInt();
//        arrInt = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter element " + i+":");
//            arrInt[i] = sc.nextInt();
//            stack.push(arrInt[i]);
//        }
//        int i = 0;
//        while (!(stack.empty())) {
//            arrInt[i] = stack.pop();
//            i++;
//        }
//        System.out.print("arrInt:");
//        for (int j = 0; j < n; j++) {
//            System.out.print(arrInt[j] + "\t");
//        }

        //===============================================//
        Stack<String> wStack = new Stack<>();
        String mWorld ="Tran";
        char temp;
        for (int j = 0; j <mWorld.length() ; j++) {
            temp=mWorld.charAt(j);
            wStack.push(String.valueOf(temp));
        }
        mWorld="";
        while (!(wStack.empty())){
            mWorld+=wStack.pop();
        }
        System.out.println(mWorld);
    }
}
