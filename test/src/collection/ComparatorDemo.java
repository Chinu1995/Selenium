package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
	TreeSet<Integer> t=new TreeSet<>(new myComparator());
t.add(10);
t.add(15);
t.add(0);
t.add(20);
t.add(20);
System.out.println(t);
	}

}
class myComparator implements Comparator{
	
	@Override
	public int compare(Object obj1, Object obj2) 
	{
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		/*
		 * if(I1<I2) return +1; else if(I1>I2) return -1; else return 0;
		 */
		
		//return I1.compareTo(I2);//[0, 10, 15, 20]
		return I2.compareTo(I1);//[20, 15, 10, 0]
		//return -I2.compareTo(I1);//[0, 10, 15, 20]
		//return -I1.compareTo(I2);//[20, 15, 10, 0]
		//return +1;//[10, 15, 0, 20, 20]
		//return -1;//[20, 20, 0, 15, 10]
		//return 0;//[10]
		
		
		
	}
}