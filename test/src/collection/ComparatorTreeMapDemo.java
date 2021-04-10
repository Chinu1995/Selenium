package collection;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparatorTreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>(new mycomp());
		tm.put(100,100);
		tm.put(2000,200);
		tm.put(1,300);
		tm.put(130,200);
		tm.put(410, 400);
		System.out.println(tm);

		
			}

		}
	class mycomp implements Comparator{

		@Override
		public int compare(Object obj1, Object obj2) {
			Integer I1=(Integer)obj1;
			Integer I2=(Integer)obj2;
			return I2.compareTo(I1);
		}
		
	}