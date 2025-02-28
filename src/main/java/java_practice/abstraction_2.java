package java_practice;

public class abstraction_2 extends abstraction{

	@Override
	public int add(int a, int b) {
        System.out.println(a+b);
		return a+b;
	}

	@Override
	protected int sub(int a, int b) {
		   System.out.println(a-b);
		return a-b;
	}
	
	public static void main(String[] args) {
		add(5, 5, 5);
		abstraction_2 a = new abstraction_2();
		a.sub(7, 3);
		a.add(5, 6);
	}

}
