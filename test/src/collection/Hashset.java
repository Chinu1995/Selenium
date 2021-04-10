package collection;


import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
	
		HashSet<Integer> hs=new HashSet<>();
		
		hs.add(10);
hs.add(20);
hs.add(10);
hs.add(30);
hs.add(40);
hs.add(10);

System.out.println(hs);
HashSet<Object> copy = (HashSet<Object>) hs.clone();
System.out.println("Cloned ArrayList:"+copy);
		

	}

}

//duplicates are not allowed
//insertion order is not preserved