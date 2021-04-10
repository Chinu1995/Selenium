package collection;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<>();
		//t.add(null);[null] 
		t.add(40);
		t.add(50);
		t.add(80);
		t.add(10);
	
System.out.println(t);
TreeSet<String> t1=new TreeSet<>();

t1.add("A");
t1.add("a");
t1.add("B");
t1.add("S");
t1.add("Z");
//t1.add(null);
System.out.println(t1);

//comparable
System.out.println("A".compareTo("Z"));
System.out.println("Z".compareTo("B"));
System.out.println("A".compareTo("A"));

	}

}
