package Interview_Programs;

import org.testng.annotations.Test;

public class int_programs {

	
	@Test
	public  void odd_or_even() {
		int num = 4;
		if(num%2==0 ) {
			System.out.println(num+" Is even");
		}
		else {
			System.out.println(num+" Is odd");
		}
	}
	
	
	public static void fibonoci(int num) {
		int first =0;
		int second = 1;
		int next;

		for(int i=1;i<=num;i++) {
			System.out.println(first);
			next = first+second;
			first=second;
			second= next;
		}
	}


	public static void factorial(int num)  {     
		int fab =1;
		for(int i=1;i<=num;i++) {
			fab=fab*i;
		}
		System.out.println(fab);

	} 

	
	
	
	
}
