package Collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class list_practice {

	@Test
	public void array_list_sample() {

		List<String> arr = new ArrayList<>();
		arr.add("Allan");
		arr.add("arun");
		
		List<String> a= Arrays.asList("allan", "arun", "anbu");
		List<String> aa = new ArrayList<String>(arr);

		System.out.println("Size : "+arr.size());
		System.out.println(arr.contains("Allan"));
		System.out.println(arr.containsAll(a));
		System.out.println(arr.containsAll(aa));
		
		arr.addFirst("rakesh");
		arr.addLast("anand");
		arr.add(2, "Jeni");
		
		System.out.println(a.isEmpty());
	
		System.out.println(a.size());
		a.removeAll(aa);
		System.out.println(a.isEmpty());
		
		Iterator<String> itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("First : "+arr.getFirst());
		System.out.println("Last : "+arr.getLast());

	}
}
