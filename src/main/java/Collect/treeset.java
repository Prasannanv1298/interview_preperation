package Collect;

import java.util.Set;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		tr();
	}
	
	
	public static void tr() {
		Set<Integer> t = new TreeSet<Integer>();
		t.add(1);
		t.add(22);
		t.add(12);
		t.add(55);
		t.add(23);
		t.add(10);
		t.add(9);
		t.add(0);
		t.add(5);
		
		System.out.println(t);
		
	}
}
