package java_practice;

abstract class shape{
	int value;
	shape(int num){
		this.value = num;
	}

	public void calculation() {
		System.out.println(value*value*value);
	}

	public void results() {}

}

public class square extends shape {
	square(int num) {
		super(num);
	}

	public void calculation() {
		System.out.println(value*value);
	}
}


 class asss{
	 public static void main(String[] args) {
			square obj = new square(8);
			obj.calculation();
		}
}