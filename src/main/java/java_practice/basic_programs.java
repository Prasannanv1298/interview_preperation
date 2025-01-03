package java_practice;

public class basic_programs {

	public static void main(String[] args) {
		//		odd_or_even(0);
		//		prime_or_not(9);
		//		fibonoci(5);
//         factorial(6);
		reverse_a_number(405670);
	}


	public static void odd_or_even(int num) {
		if(num%2==0 ) {
			System.out.println(num+" Is even");
		}
		else {
			System.out.println(num+" Is odd");
		}
	}


	public static void prime_or_not(int num) {

		if(isPrime(num)) {
			System.out.println(num+" Is prime");
		}
		else {
			System.out.println(num+" Is not prime");
		}
	}

	public static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
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

	
	
	public static void reverse_a_number(int num) {
	int main = num;
	int res=0;
	int r;
	
	while(main>0) {
		r=main%10;
		res = res*10+r;
		main=main/10;
	}
	System.out.println(res);
	}

	
	 public static void armstrong() {
		
		
	 }
}
