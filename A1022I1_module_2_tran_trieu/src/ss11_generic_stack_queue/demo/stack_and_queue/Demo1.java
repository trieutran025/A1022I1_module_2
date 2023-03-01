package ss11_generic_stack_queue.demo.stack_and_queue;

import java.util.ArrayList;
import java.util.List;


public class Demo1 {
    public static void showElement(List<? extends Number> arr) {//Chi duyet so
        for (int index = 0; index < arr.size(); index++) {
            System.out.print(arr.get(index) + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> arrInt = new ArrayList<>();
        arrInt.add(5);
        arrInt.add(6);
        arrInt.add(7);

        List<Double> arrDouble = new ArrayList<>();
        arrDouble.add(6.2);
        arrDouble.add(5.0);
        arrDouble.add(25.2);

        List<String> arrStr = new ArrayList<>();
        arrStr.add("a");
        arrStr.add("b");
        arrStr.add("c");

//        showElement(arrInt);
//        showElement(arrDouble);
//        showElement(arrStr);//error compile

    }
}
