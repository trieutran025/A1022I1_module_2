package ss11_generic_stack_queue.demo.map_and_tree;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        Map<String,Integer> myMap = new LinkedHashMap<>();
        myMap.put("A",1);
        myMap.put("F",22);
        myMap.put("D",33);
        myMap.put(null,99);
        for(String key : myMap.keySet()){
            System.out.println(key +"-"+myMap.get(key));
        }
    }
}
