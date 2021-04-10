package test;

public class Methodoverloading {
	
	/*
	 * public void m1(int x) { System.out.println(x); }
	 */
	
	/*
	 * public void m1(float f) { System.out.println(f); }
	 */
	
	/*
	 * public void m1(String s) { System.out.println(s); }
	 */
	
	/*
	 * public void m1(Number n) { System.out.println(n); }
	 */
	/*
	 * public void m1(Integer i) { System.out.println(i); }
	 */
	
	public void m1(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		Methodoverloading obj= new Methodoverloading();
		obj.m1(10);//1->float type 2>integer 3>object
		obj.m1(125.4f);//->number 2>object
		obj.m1("ravi");//object
		obj.m1(100);//number object
		obj.m1(200.52f);//object
		obj.m1("chinu");//object

	}

}
