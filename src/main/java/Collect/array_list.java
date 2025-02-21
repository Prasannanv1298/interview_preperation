package Collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array_list {

	public static void main(String[] args) {
		first_and_last_array_list_value();
		//collection_sort();
	}
	
	
	public static void first_and_last_array_list_value() {
		
		List<String> arr = new ArrayList<String>();
		List<String> arr2 = new ArrayList<String>();
		arr.add("Allan");
		arr.add("Arun");
		arr.add("Anbu");
		arr.add("Babu");
		arr.add("Bala");
		arr.add("Anand");
		arr.add("Allan");
		
		if(!arr.isEmpty()) {
			System.out.println("First value : "+arr.getFirst());
			System.out.println("First value : "+arr.get(0));
			System.err.println("Last value : "+arr.getLast());
			System.err.println("Last value : "+arr.get(arr.size()-1));
		}
		
		arr2.addAll(arr);
		for(String s : arr2) {
			System.out.println(s);
		}
		
	
		
		System.err.println("Equals :" +arr.equals(arr2));
		System.err.println("Contains : "+arr.contains("Allan"));
		System.err.println("Index of : "+arr.indexOf("Anand"));
		System.err.println("Is Empty : "+arr.isEmpty());
		System.err.println("Last index of : "+arr.lastIndexOf("Allan"));
		System.err.println("-------------Remove : "+arr.remove(arr.indexOf("Anand")));
		System.out.println(arr);
		System.err.println("Size : "+arr.size());
		System.err.println("Hash code : "+arr.hashCode());
		System.err.println(arr2.removeAll(arr2));
		System.err.println("Is Empty : "+arr2.isEmpty());
		System.err.println(arr.removeFirst());
		System.err.println(arr.removeLast());
		for(String s : arr) {
			System.out.println(s);
		}
		System.err.println(arr.set(3, "Banu"));
		System.err.println(arr.removeIf(aa -> aa.contains("a")));
		System.err.println(arr.toArray());
		System.err.println(arr.toString());
		System.err.println(arr.getClass().getName());
		System.out.println(arr.reversed());
		
		
		List<String> ret1 =  Arrays.asList("a1","a2", "a3", "a4","a5","qq");
		List<String> ret2 =  new ArrayList<String>(Arrays.asList( "a4","a5","qq"));
		System.out.println(ret1.retainAll(ret2));
		System.out.println(ret1);
		ret1.replaceAll(f -> f.toUpperCase());
		System.out.println(ret1);
		arr.clear();	
		
	}
	
	
	
	
	public static void collection_sort() {
		
		List<Integer> jk = new ArrayList<Integer>(Arrays.asList(1,5,6,7,3,2,6));
		 
		jk.sort(null);
	
		System.out.println(jk);
		
		jk.forEach(System.out::println);
		
		
	}
	
	
}
