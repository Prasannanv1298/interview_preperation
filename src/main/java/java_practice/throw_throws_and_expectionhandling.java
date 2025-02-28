package java_practice;

import java.io.IOException;
import org.testng.annotations.Test;

public class throw_throws_and_expectionhandling {

	@Test(enabled = false)
	public void try_catch() {
		try {
			int result = 10 / 0; // ArithmeticException
			System.out.println("Result: " + result);
		} 
		catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}


	@Test(enabled = false)
	public void try_catch_finally() {
		try {
			int result = 10 / 0; // ArithmeticException
			System.out.println("Result: " + result);
		} 
		catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
		finally {
			System.out.println("This block is always executed.");
		}
	}


	@Test(enabled = true)
	public void multiple_catch() throws IOException{
		try {
			int[] numbers = {1, 2, 3};
			System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			int[] numbers = {1, 2, 3};
			System.out.println(numbers[5]);
			System.out.println("Array index out of bounds: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("General exception: " + e.getMessage());
		}
	}


	@Test(enabled = false)
	public void nested_try() { 
		try {
			try {
				int result = 10 / 0;
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("Inner catch: " + e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Outer catch: " + e.getMessage());
		}
	}


	@Test(enabled = false)
	public void throww() {
		throw new NullPointerException("Null Pointer is custmom exc");
	}


	@Test(enabled = false)
	public void throwss() throws InvalidAgeException  {
		int age =1;
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above.");
		}
	}	
	

}


class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}
