package ss11_generic_stack_queue.pratice.pr1_stack_in_linked_List;

import java.util.EmptyStackException;
import java.util.LinkedList;


public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addLast(element);
    }
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }
        return false;
    }
}
