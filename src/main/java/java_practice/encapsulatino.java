package java_practice;

public class encapsulatino {

	private static int marks;
	private static String name;
	
	public encapsulatino(String name, int marks) {
		encapsulatino.marks=marks;
		encapsulatino.name=name;
	}
	
	public String get_name() {
		System.out.println(name);
		return encapsulatino.name;
	}
	
	public void setName(String name) {
		encapsulatino.name=name;
	}
	
	public int get_marks() {
		System.out.println(marks);
		return encapsulatino.marks;
	}
	
	public void setMarks(int marks) {
		encapsulatino.marks=marks;
	}
}
