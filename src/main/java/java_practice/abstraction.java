package java_practice;

public abstract class abstraction {
	
	static int abb;
	static {
		System.out.println("Static block executting");
		abb= 440;
	}

	public abstraction() {
		System.out.println(abb);
		System.out.println("Abstract class constructor... running");
	}
	
	
	public abstract int add(int a, int b);
	
	protected abstract int sub(int a, int b);
	
	public static int add(int a, int b, int c) {
		System.out.println(a+b+c);
		return a+b+c;
	}


	
}
