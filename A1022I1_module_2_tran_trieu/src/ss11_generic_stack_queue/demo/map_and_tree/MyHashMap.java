package ss11_generic_stack_queue.demo.map_and_tree;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("A", 1);
        myMap.put("F", 22);
        myMap.put("D", 33);
        myMap.put(null, 99);
        myMap.put("A", 100);//update
        myMap.replace("o", 56);
//        System.out.println(myMap.get("D"));
        /* Duyet mang bang KeySet*/
//        for (String key : myMap.keySet()) {
//            System.out.println(key + "-" + myMap.get(key));
//        }

//        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
//            System.out.println(entry.getKey() + "-" + entry.getValue());
//        }
        Student student1 = new Student(1, "Nguyen Van A");
        Student student2 = new Student(2, "Nguyen Van B");
        Student student3 = new Student(3, "Nguyen Van C");
        Student student4 = new Student(4, "Nguyen Van D");
        Student student5 = new Student(5, "Nguyen Van B");
        Map<Student, Integer> studentMap = new HashMap<>();
        studentMap.put(student1, 11);
        studentMap.put(student2, 22);
        studentMap.put(student3, 33);
        studentMap.put(student4, 44);
        studentMap.put(student5, 99);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());
        System.out.println(student5.hashCode());
        for (Student key : studentMap.keySet()) {
            System.out.println(key + "-" + studentMap.get(key));
        }

    }
}
