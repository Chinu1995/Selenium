package collection;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
	LinkedList<Object> ll=new LinkedList<Object>();
	ll.add("chinu");
	ll.add(30);
	ll.add(null);
	ll.add("chinu");
	System.out.println(ll);
	
	ll.add(1, "chinu1");
	System.out.println(ll);
	
	ll.removeLast();
	System.out.println(ll);
	
	ll.addFirst("chinmaya");
	System.out.println(ll);

	System.out.println(ll.getFirst());
	System.out.println(ll.getLast());
	System.out.println(ll.get(2));
		
	}

}
//insertion order preserved
//null insertion possible
//duplicates are allowed