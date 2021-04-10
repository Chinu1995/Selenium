package test;

public class B extends A {
	public void m1()
	{ 
	System.out.println("im overridden from class A");
	}
	public void m2()
	{ 
	System.out.println("im m2 from class B");
	}
	public static void main(String[] args) {
		A obj=new A();  // HASA RELATIONSHIP
		obj.m1();
		
		B obj1=new B();
		obj1.m2();
		
		B obj2=new B();
		obj2.m1();
	}

}
