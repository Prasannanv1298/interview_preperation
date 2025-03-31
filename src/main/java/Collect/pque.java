
package Collect;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class pque {

	public static void main(String[] args) {
		pque p = new pque();
		p.add();
	}
	
	static Queue<String> que = new PriorityQueue<String>();
	
	public void add() {
		String[] arr= {"john", "snow", "arya", "stark"};
		List<String> a = Arrays.asList(arr);
		que.add("allan");
		que.addAll(a);		
		System.out.println(que.peek());
		System.out.println(que.remove());
		
		Iterator<String> g = que.iterator();
		while(g.hasNext()) {
			System.out.println(g.next());
		}

	}
	
	
	
}
