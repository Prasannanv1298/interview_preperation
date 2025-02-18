package Interview_Programs;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class string_programs {

	@Test(enabled = false)
	public void reverse_string() {
		String orginal = "Selenium";
		String rev = "";
		for(int i = orginal.length()-1;i>=0;i--) {
			rev += orginal.charAt(i);
		}
		System.err.println(rev);
	}

	@Test(enabled = false)
	public void reverse_string_buildin() {
		String orginal = "Selenium";
		String  res = new StringBuilder(orginal).reverse().toString();
		System.out.println(res);
	}

	@Test(enabled =  false)
	public void string_palindrom() {
		String orginal = "malayalam";
		String  res = new StringBuilder(orginal).reverse().toString();
		if(res.equals(orginal)) {
			System.out.println(orginal+" Is a palindrom");	}
		else {System.out.println(orginal+" Is not a palindrom");}
	}

	@Test(enabled = false)
	public void duplicate_char_count() {
		String str = "automation";
		Map<Character, Integer> count = new HashMap<>();

		for (char c : str.toCharArray()) {
			count.put(c, count.getOrDefault(c, 0) + 1);
		}

		System.out.println("Duplicate characters:");
		for (Map.Entry<Character, Integer> entry : count.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " = " + entry.getValue());
			}
		}
	}


	@Test(enabled = false)
	public void duplicate_words() {
		String original ="What is your name , My name is andy";
		String[] original_split=original.split(" ");

		Map<String, Integer> count = new HashMap<String, Integer>();
		for(int i = original_split.length-1; i>=0;i--) {
			count.put(original_split[i], count.getOrDefault(original_split[i], 0)+1);
		}

        for(Map.Entry<String, Integer> split_count : count.entrySet()) {
        	if(split_count.getValue()>1) {
        		System.out.println(split_count.getKey() + "  "+ split_count.getValue());
        	}
        }
	}

    @Test(enabled = false)
	public void reverse_the_sentance() {
		String original = "My name is andy";
		String[] original_split= original.split(" ");
		String reverser_sentance="";
		for(int i=original_split.length-1;i>=0;i--) {
			reverser_sentance +=original_split[i]+" ";
		}
		System.out.println(reverser_sentance);
	}

    @Test
    public void reverse_word() {
    	String str = "Java is fun";
    	String reversed = String.join(" ", new StringBuilder(str).reverse().toString().split(" "));
    	System.out.println(reversed);
    }


















}
