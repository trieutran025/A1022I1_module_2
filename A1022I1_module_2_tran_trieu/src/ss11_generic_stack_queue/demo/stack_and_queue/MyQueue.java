package ss11_generic_stack_queue.demo.stack_and_queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.offer(1);
        myQueue.add(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.element());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.remove());
//        System.out.println(myQueue.remove());
    }
}
