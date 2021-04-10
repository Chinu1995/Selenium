package collection;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		//ArrayList<Integer> a= new ArrayList<Integer>();
		ArrayList<Object> a= new ArrayList<Object>();
		a.add(10);
		a.add(20);
		a.add("Chinu");
		a.add(12.5f);
		a.add(10);
		a.add(30);
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a);
		a.add(40);
		System.out.println(a);
		a.add(1, "babul");
		System.out.println(a);
		
		System.out.println(a.subList(2, 6));
		System.out.println(a.contains("Chinu"));
		System.out.println(a);
		
		a.set(3, "chinmaya");
		System.out.println(a);

		a.remove(7);
		System.out.println(a);
		
		a.remove("babul");
		System.out.println(a);
		
		//a.clear();
		//System.out.println(a);
		ArrayList<Object> copy = (ArrayList<Object>) a.clone();
		System.out.println("Cloned ArrayList:"+copy);
		
		
		
		
	}
	
	

}
