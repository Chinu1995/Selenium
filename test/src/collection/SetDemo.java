package collection;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=0;i<=10;i++) {
			h.add(i);
		}
System.out.println(h);


HashSet<Integer> h1=new HashSet<Integer>();
h1.add(10);
h1.add(20);
h1.add(10);
h1.add(30);
h1.add(40);
h1.add(10);
System.out.println(h1);
	}
	
	

}
