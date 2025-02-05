package java_practice;

public class loops {

	
	
	public static void main(String[] args) {
		
		
		
		for(int i=1; i<=5;i++) {
			System.out.println(i);
		}
		
		
		int[] arr = {1,3,4,5,2,6,7};
		
		for(int i : arr) {
			System.out.println(i);
		}
	
		
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		
		int j=0;
		do {
			System.out.println(j);
			j++;
		}while(j<10);
		
		
		if(i==10) {
			System.out.println("if");
		}
		else {
			System.out.println("else");
		}
		
		
		String key ="animals";
		switch(key) {
		case "birds":
			System.out.println("displayig birds");
			break;
		case "animals":
			System.out.println("diaplaying animals");
			break;
			
		default:
			System.out.println("nothing to diaply");
			break;
		}
		

		try {
			
		} catch (Exception e) {
			
		}
		finally {
			System.out.println("hi");
		}
		
	}
}
