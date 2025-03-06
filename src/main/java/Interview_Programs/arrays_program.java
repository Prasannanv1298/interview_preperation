package Interview_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import org.testng.annotations.Test;

public class arrays_program {

	@Test(enabled = true)
	public void duplicate_in_array_using_set() {
		System.out.println("Removing duplicats in array");
		int[] arr = {1,2,3,4,5,4,3,4};
		Set<Integer> common = new HashSet<Integer>();

		for(int m : arr){
			common.add(m);
		}
		for(int m: common) {
			System.err.println(m);
		}
	}


	@Test(enabled = false)
	public void common_values_in_two_array() {
		System.out.println("Common values in two arrays");
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

	@Test(enabled = false)
	public void arr_sort() {
		Integer[] arr= {3,4,6,1,2,6,7,8,5,2};

		System.out.println("Array - Ascending order");
		Arrays.sort(arr);
		for(int i : arr) {System.out.println(i);}

		System.out.println("Array - Descending Order");
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i : arr) { System.out.println(i);}
	}

	@Test(enabled = false)
	public void  to_list() {
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



	@Test(enabled = false)
	public void odd_even_in_array() {
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



	@Test(enabled = false)
	public void sum_of_arrays(){
		System.out.println("Sum of Arrays");
		System.err.println("Type 1");
		int[] arr = {1,3,5,7,9};
		int sum =0;
		for(int a : arr) {
			sum +=a;
		}
		System.out.println(sum);


		System.err.println("Type 2");
		int sum2 = Arrays.stream(arr).sum();
		System.out.println(sum2);

		System.err.println("Type 3");
		int sum3= IntStream.of(arr).sum();
		System.out.println(sum3);


		System.err.println("Type 4");
		int sum4= Arrays.stream(arr).parallel().sum();
		System.out.println(sum4);
	}

	@Test(enabled =  true)
	public void min_and_maximum() {
		int [] arr= { 1,3,5,7,9,11,15,20};

		
		System.out.println("Type 1");
		int min1= Arrays.stream(arr).min().orElseThrow();
		System.out.println(min1);
		int max1= Arrays.stream(arr).max().orElseThrow();
		System.out.println(max1);
		double avg1= Arrays.stream(arr).average().orElseThrow();
		System.out.println(avg1);


		System.out.println("Type 2");
		int max = arr[0];
		int min = arr[0];
		for(int num : arr) {
			if(num>max) max=num;
			if(num<min) min=num;
		}

		System.out.println(min);
		System.out.println(max);

		System.out.println("Type 3");
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		double sum =0;
		for(int a : arr) {
			sum +=a;
		}
		System.out.println(sum/arr.length);


		Integer [] arr2= { 1,3,5,7,9,11,15,20};
		System.out.println("Type 4");
		List<Integer> as_list = Arrays.asList(arr2);
		int max4 = Collections.max(as_list);
		int min4 = Collections.min(as_list);
		System.out.println(min4);
		System.out.println(max4);
	}














	public static void binary_search(){
		int[] arr = {1,2,3,4,5,4,3,4};
		int in = Arrays.binarySearch(arr, 4);// return the index of value
		System.out.println(in);

		int k = Arrays.binarySearch(arr, 1, 6, 3);
		System.out.println(k);
	}


	public static void equal() {
		String[] arr1 = {"allan", "john", "nick"};
		String[] arr2 = {"allan", "john", "nick"};
		boolean m = Arrays.equals(arr1, arr2);
		System.out.println(m);
		System.out.println(arr1[1]);


		int[][] dk = {{1,2} , {3,4}};
		int[][] dd = {{1,2} , {3,1}};
		boolean d =Arrays.deepEquals(dk, dd);
		System.out.println(d);
		System.out.println(Arrays.deepToString(dd));
	}


	public static void copy_of() {
		int[] arr = {3,4,1,2};

		System.err.println("Copy of");
		int[] a=Arrays.copyOf(arr, 7);
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);

		System.err.println("Copy of range");
		int[] b = Arrays.copyOfRange(a, 0, 3);
		System.out.println(Arrays.toString(b));
		System.out.println(b.length);
	}

	public static void fil() {
		int[] arr = new int[5];
		Arrays.fill(arr, 4);
		System.out.println(Arrays.toString(arr));
	}





}
