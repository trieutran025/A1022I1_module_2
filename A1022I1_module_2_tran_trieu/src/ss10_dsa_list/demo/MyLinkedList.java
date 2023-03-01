package ss10_dsa_list.demo;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        List myArr = new LinkedList();
//        myArr.add(1);
//        myArr.add(new Integer(1));
//        myArr.add(new Integer(8));
//        myArr.add(6.0);
//        myArr.add(new Double(6.0));
//        myArr.set(2,11);
        myArr.add(1);
        myArr.add(2);
        myArr.add(3);
//        myArr.remove(2);
        myArr.contains("HU");
        myArr.remove(new Integer(3));
        for (int index = 0; index < myArr.size(); index++) {
            System.out.println(myArr.get(index) + " ");
        }
//        int index = myArr.indexOf(1);
//        System.out.println(index);
//        System.out.println(myArr.contains(2));
//        System.out.println(myArr.size());
//        System.out.println(myArr.get(2));
    }
}
