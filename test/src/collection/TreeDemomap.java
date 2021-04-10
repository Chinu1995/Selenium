package collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeDemomap {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> tm=new TreeMap<>();
		//TreeMap tm=new TreeMap ();
		tm.put(100,100);
		tm.put(2000,200);
		tm.put(1,300);
		tm.put(130,200);
		tm.put(410, 400);
		System.out.println(tm);

	}

}
