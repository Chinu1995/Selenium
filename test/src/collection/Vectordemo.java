package collection;


import java.util.Vector;

public class Vectordemo {

	public static void main(String[] args) {
		
		//Vector v=new Vector();
		Vector<Object> h1=new Vector<Object>();
		Vector<Integer>v=new Vector<Integer>();
		for(int i=0;i<=10;i++) {
			v.add(i);
		}
		System.out.println(v);
		
		
		h1.add(10);
		h1.add(20);
		h1.add(10);
		h1.add(30);
		h1.add(40);
		h1.add(10);
		h1.add(null);
		
		System.out.println(h1);
		System.out.println(h1.capacity());//Returns the current capacity of this vector maximum num of 10
		h1.add("A");
		System.out.println(h1);
		System.out.println(h1.capacity());
	}

}
//insertion order preserved
//null insertion possible
//duplicates are allowed
