package Interview_Programs;

import org.testng.annotations.Test;

public class int_programs {

	
	@Test(enabled = false)
	public  void odd_or_even() {
		int num = 4;
		if(num%2==0 ) {
			System.out.println(num+" Is even");
		}
		else {
			System.out.println(num+" Is odd");
		}
	}
	
	@Test(enabled = false)
	public void fibonoci(int num) {
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


	@Test(enabled = false)
	public void factorial(int num)  {     
		int fab =1;
		for(int i=1;i<=num;i++) {
			fab=fab*i;
		}
		System.out.println(fab);

	} 

	@Test(enabled = false)
	public void leap_yaer() {
		int year=2027;
		System.out.println("Finding a year is leap or not");
		if(year%4==0) {
			System.out.println("Is leap");
		}
		else {System.out.println("is not leap");}
		
	}
	
	
	@Test(enabled = false)
	public void Prime_Number(){
        if(isPrime(12))  System.out.println("Is Prime");
        else System.out.println("Is not Prime");
    }
    
    public boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2; i<=num/2+1; i++){
            if(num%i==0) return false;
        }
        return true;
    }
	
	
    @Test
    public void swaping_of_two_numbers() {
    	int a = 5;
    	int b = 10;
    	
    	a=a+b;
    	b=a-b;
    	a=a-b;
    	System.out.println(a +"  "+ b);
    }
	
}
