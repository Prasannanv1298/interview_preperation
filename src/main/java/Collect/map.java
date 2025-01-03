package Collect;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {

	 public static void main(String[] args) {
	        // Using HashMap
	        Map<Integer, String> map = new HashMap<>();
	        map.put(1, "One");
	        map.put(2, "Two");
	        map.put(3, "Three");
	        map.put(2, "Duplicate"); // Overwrites the value for key 2

	        System.out.println("HashMap: " + map);

	        // Using TreeMap
	        Map<Integer, String> sortedMap = new TreeMap<>(map);
	        System.out.println("TreeMap (Sorted): " + sortedMap);

	        // Using LinkedHashMap
	        Map<Integer, String> orderedMap = new LinkedHashMap<>();
	        orderedMap.put(3, "Three");
	        orderedMap.put(1, "One");
	        orderedMap.put(2, "Two");
	        System.out.println("LinkedHashMap: " + orderedMap); // Maintains insertion order
	    }
}
