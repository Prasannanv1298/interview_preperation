package java_practice;

public class this_super {

	public static void main(String[] args) {
		Child c = new Child();
		//		c.display();
		c.show();
	}
}



class Parent {
	String name = "Parent";

	void display() {
		System.out.println("Parent Display");
	}	
}

class Child extends Parent {
	String name = "Child";

	void display() {
		System.out.println("Child Display");
	}

	void show() {
		System.out.println(this.name); // Refers to Child's name
		System.out.println(super.name); // Refers to Parent's name

		this.display(); // Calls Child's display
		super.display(); // Calls Parent's display
	}
}
