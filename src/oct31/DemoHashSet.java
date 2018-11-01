package oct31;

import java.util.HashSet;

public class DemoHashSet {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<>();
		
		set.add("Cat");
		set.add("Dog");
		set.add("cow");
		set.add("camel");
		set.add("camel");
		System.out.println(set.size());
		
		System.out.println(set);
		
		for(String s:set) {
			System.out.println(s+" ");
		}
		
		
	}

}
