package collection;

import java.util.LinkedHashMap;
import java.util.Set;



public class LinkedHashmapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Integer> h=new LinkedHashMap<Integer,Integer>();
		h.put(10,100);
		h.put(20, 200);
		h.put(10, 300);
		h.put(30, 2000);
		h.put(40, 400);
		System.out.println(h);
		System.out.println(h.get(20));
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		Set<Integer> s=h.keySet();
		System.out.println(s);
		for(Integer key:s) {
			System.out.println(key+"--------"+h.get(key));
		}
		h.remove(10);
		System.out.println(h);
		LinkedHashMap<Integer,Integer> h1=new LinkedHashMap<Integer,Integer>();
		h1.put(1995, 17);
		h.putAll(h1);
System.out.println(h1);
	}

}
