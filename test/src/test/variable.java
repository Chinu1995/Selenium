package test;

public class variable {
	static variable v;//static reference variable
 int i=100;//instance variable
	static String s="ram";
	public void disp() {
		int i=1000;
		System.out.println(i);//local variable
		System.out.println(s);
		System.out.println(this.i);//to call instance variable
	}
	public void m3() {
		System.out.println("im reference static");
	}
	public  static void m2() {
		System.out.println("hi m2 static");
	}
public static void main(String[] args) {
	//variable v=new variable();//local reference var(v)
	v=new variable();
	v.disp();
	System.out.println(v.i);
	System.out.println(s);//call directly to static var
	System.out.println(variable.s);//call indirectly to static var
	m2();
v.m3();
}
}
