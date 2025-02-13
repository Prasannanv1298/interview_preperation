package Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class arrays_program {

	public static void duplicate_in_array_using_set() {
		int[] arr = {1,2,3,4,5,4,3,4};
		Set<Integer> common = new HashSet<Integer>();

		for(int m : arr){
			common.add(m);
		}
		for(int m: common) {
			System.err.println(m);
		}
	}


	public static void common_values_in_two_array() {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {2,4,6,3,7,8};

		Set<Integer> s1= new HashSet<Integer>();
		Set<Integer> common= new HashSet<Integer>();

		for(int m :arr1) {
			s1.add(m);
		}

		for(int m :arr2) {
			if(s1.contains(m)) {
				common.add(m);
			}
		}

		for(int m:common) {
			System.out.println(m);
		}
	}



	public static void first_and_last_array_value() {
		int[] arr1= {1,2,3,4,3,2,5,77,8,99,88};

		System.out.println("First value : "+arr1[0]);
		System.out.println("Last value : "+arr1[arr1.length-1]);
	}


	public static void arr_sort() {
		Integer[] arr= {3,4,6,1,2,6,7,8,5,2};

		System.out.println("Array - Ascending order");
		Arrays.sort(arr);
		for(int i : arr) {System.out.println(i);}

		System.out.println("Array - Descending Order");
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i : arr) { System.out.println(i);}
	}

	public static void to_list() {
		Integer[] arr= {3,4,6,1,2,6,7,8,5,2};

		System.out.println("Conversion of Array to list");
		List<Integer> m = Arrays.asList(arr);
		System.out.println("List ascending orrder");
		m.sort(null);
		m.forEach(System.out::println);

		System.out.println("List descending order");
		Collections.sort(m, Collections.reverseOrder());
		m.forEach(System.out::println);

		System.out.println("Conversion of list to array");
		List<Integer> n = new ArrayList<Integer>(Arrays.asList(1,6,2,7,4,9));
		Object[] obj= n.toArray();
		for(Object i : obj) {	System.out.println(i);}
	}

	public static void sum_of_array() {
		System.out.println("Sum of array");
		Integer[] arr= {3,4,6,1,2,6,7,8,5,2};
		int sum=0;

		for(int i : arr) {
			sum+=i;
		}
		System.out.println(sum);
	}


	public static void odd_even_in_array() {
		System.out.println("Count of odd or even in numbers");
		Integer[] arr= {3,4,6,1,2,6,7,8,5,2,};

		int even = 0, odd =0;
		for(int i : arr) {
			if(i%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}

		System.out.println("Number of even numbers count in array : " + even);
		System.out.println("Number of odd numbers count in array : " + odd);
	}


	public static void finding_unique_in_array() {
		Integer[] arr = {1,2,3,4,4,5,5,6,1,8};

		System.out.println("Finding unique number in array");

		for(int i =0 ;i<=arr.length-1 ; i++) {
			int n=0;

			for(int j=0;j<=arr.length-1; j++) {
				if(arr[i]==arr[j]);
				n++;
				if(n>=2);
				break;
			}

		}
	}
}
