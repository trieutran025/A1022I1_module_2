package ss11_generic_stack_queue.pratice.linkedHaspMap_treeMap_hashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        /* Code here*/
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith ", 30);
        hashMap.put("Anderson ", 31);
        hashMap.put("Lewis ", 29);
        hashMap.put("Cook ", 28);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHaspMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHaspMap.put("Smith", 30);
        linkedHaspMap.put("Anderson", 31);
        linkedHaspMap.put("Lewis", 29);
        linkedHaspMap.put("Cook", 28);
        System.out.println("\nThe age for" + "Lewis is" + linkedHaspMap.get("Lewis"));
    }

}
