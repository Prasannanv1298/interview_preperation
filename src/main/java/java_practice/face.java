package java_practice;

public class face extends abstraction_2 implements inter2, ineter1{

	@Override
	public int addition(int a, int b) {
		System.out.println(inetr);
		System.out.println(a+b);
		return a+b;
	}

	@Override
	public int substraction(int a, int b) {
		System.out.println(inetr2);
		System.out.println(a-b);
		return a-b;
	}
	
	public static void main(String[] args) {
		add(1,3,6);
		face f = new face();
		f.addition(4,6);
		System.out.println(inetr);
		f.substraction(4, 4);
	}
	

}
