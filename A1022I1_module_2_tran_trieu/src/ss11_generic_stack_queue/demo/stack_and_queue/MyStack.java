package ss11_generic_stack_queue.demo.stack_and_queue;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
//        while (!myStack.empty()){
//            System.out.println(myStack.pop());
//        }\
//        for (int index = 0; index <myStack.size() ; index++) {
//            System.out.println(myStack.get(index));
//        }
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        System.out.println(myStack.empty());
    }
}
