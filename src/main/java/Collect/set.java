package Collect;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {

	public static void main(String[] args) {
		   // Using HashSet
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, will not be added

        System.out.println("HashSet: " + fruits); // No guaranteed order

        // Using TreeSet
        Set<String> sortedFruits = new TreeSet<>(fruits);
        System.out.println("TreeSet (Sorted): " + sortedFruits);

        // Using LinkedHashSet
        Set<String> orderedFruits = new LinkedHashSet<>();
        orderedFruits.add("Apple");
        orderedFruits.add("Banana");
        orderedFruits.add("Orange");
        System.out.println("LinkedHashSet: " + orderedFruits); // Maintains order
    
	}
}
