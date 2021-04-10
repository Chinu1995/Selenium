package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
LinkedHashSet<Object> h1=new LinkedHashSet<Object>();
		
		h1.add(10);
		h1.add(20);
		h1.add(10);
		h1.add(30);
		h1.add(40);
		h1.add(10);
		System.out.println(h1);
		

	}

}
//duplicates are not allowed
//insertion order preserved