package ss11_generic_stack_queue.pratice.pr1_stack_in_linked_List;

public class GenericStackClient {
    private static void StackOfIString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1. Size of stack after push operations: ");
        System.out.println("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }

    private static void StackOfInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: ");
        System.out.println("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n2.3. Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {

        System.out.println("1. Stack of Strings");
        StackOfIString();

        System.out.println("2. Stack of integers");
        StackOfInteger();
    }
}
