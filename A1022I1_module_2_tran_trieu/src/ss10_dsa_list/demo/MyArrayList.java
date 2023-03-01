package ss10_dsa_list.demo;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List myArr = new ArrayList<>();
//        myArr.add(new Student(1,"Nguyen van A"));
//        myArr.add(new Student(2,"Nguyen Van B"));
//        myArr.add(new Student(3,"Tran Thi C"));
//        System.out.println(myArr.get(0));
//        System.out.println(myArr.get(1));
//
//        for (Object o : myArr) {
//            System.out.println(o);
//        }
//        myArr.add(1);
//        myArr.add(new Integer(1));
//        myArr.add(new Integer(8));
//        myArr.add(6.0);
//        myArr.add(new Double(6.0));
//        myArr.set(2,11);
        myArr.add(1);
        myArr.add(2);
        myArr.add(3);
        myArr.add(5);
        myArr.add(4);
        myArr.get(1);
        myArr.size();

        myArr.remove(2);
        myArr.contains(3);
        myArr.clear();

//        myArr.remove(2);
//        myArr.remove(new Integer(3));
//        for (int index = 0;index<myArr.size();index++){
//            System.out.println(myArr.get(index)+" ");
//        }
//        int index = myArr.indexOf(1);
//        System.out.println(index);
        System.out.println(myArr.contains(2));
//        System.out.println(myArr.size());
        System.out.println(myArr.get(2));
    }
}
