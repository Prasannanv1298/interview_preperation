package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class StreamAPI {
	
	@Test
	public void psvm() {
		List<Integer> ss = new ArrayList<>();
		
		for(int i=0; i<=50; i++) {
			ss.add(i);
		}
		
		//System.out.println(ss);
		
		//System.err.println(ss.stream().filter(n->n>10 && n<20 && n!=11).collect(Collectors.toList()));
		
		List<String> string = Arrays.asList("Sathish","Dinesh","Kathir","Saravanan","Prasannan","Vignesh");
		
		long ssss = string.stream().filter(s-> s.startsWith("S")).count();// Count the filtered data
		
		System.err.println(ssss);
		
		List<Integer> duplicate = Arrays.asList(1,1,1,2,4,6,7,3,9,10,2,3);
		
		duplicate.stream().distinct();// Remove duplicate
		
		System.err.println(	duplicate.stream().filter(n-> n>5).map(n-> n+10).collect(Collectors.toList()));
		// Manupulate the data
		
		//System.out.println(ss.stream().filter(n-> n>10).collect(Collectors.toList()));
		
		//System.out.println(ss.stream().filter(n-> n>10 && n<=20).map(n-> n+10).collect(Collectors.toList()));
		
		

	}

}
