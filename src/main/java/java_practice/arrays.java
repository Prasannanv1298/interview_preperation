package java_practice;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
//		to_list();
//		binary_search();
//		equal();
//		copy_of();
//		fil();
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
