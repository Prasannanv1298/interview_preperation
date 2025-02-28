package java_practice;

public class runtime_poly extends complile_time_poly{

	@Override
	public int add(int a, int b) {
		System.out.println(a-b);
		return a-b;
	}
	
	public static void main(String[] args) {
		runtime_poly r = new runtime_poly();
		r.add(5, 9);
	}
}
