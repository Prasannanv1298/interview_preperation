package Collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {

    public hashmap() {
		System.err.println(" Constructor");
	}
    
    static int iii;
	
    static {
    	iii = 10;
		System.out.println("Hi");
		System.out.println("Hello");
	}
    
    
    
	public static void main(String[] args) {
		/*hashmap g = new hashmap();
		mapp();
		map3();*/
	
		
		System.out.println(iii);
	}
	
	public static void mapp() {
		Map<String, String> m = new HashMap<String, String>();
		m.put("Name", "Allan");
		m.put("Hobby", "Fishing");
		m.put("occupatino", "BPO");
		
		
		
		Set<String> s = m.keySet();
		for(String h : s) {
			System.err.println(h+" "+  m.get(h));
		}
		
		System.out.println("Size : "+m.size());
		System.out.println(m.get("Name"));
		System.out.println(m.isEmpty());
		System.out.println(m.putIfAbsent("Sports", "Pubg"));
		System.out.println(m.remove("Hobby"));
		System.out.println(m.remove("Name", "Allan"));
		
		
		
		Map<String, String> ad = new HashMap<String, String>();
        ad.put("Bike", "Aprile");
		ad.put("Mobile", "Iphone");
		ad.put("Watch", "Iwatch");
		m.putAll(ad);
		
		System.out.println(m.containsKey("Watch"));
		System.out.println(m.containsValue("Iphone"));
		m.compute("Bike", (key, value) -> "Twister");
		System.out.println(m.computeIfAbsent("Bike", key -> "Honda"));
		System.out.println(m.computeIfAbsent("Cname", key -> "Honda"));
		
		
		for(String h : s) {
			System.err.println(h+" : "+  m.get(h));
		}
		
	}
	
	
	
	public static void map3 () {
		Map<String, String> m = new HashMap<String, String>();
		m.put("Name", "Allan");
		m.put("Hobby", "Fishing");
		m.put("occupatino", "BPO");
		
	}
}
