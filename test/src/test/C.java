package test;

public class C extends A { //is a relationship
	public void m3()
	{ 
	System.out.println("im m2 from class B");
	}
	public static void main(String[] args) {
		A obj=new A();  // HASA RELATIONSHIP
		obj.m1();
		
		C c=new C();
		c.m3();
		c.m1();
		 //if it extends from B then it works
		//c.m2();
		
		//B c1=new C();
		//c1.m1();
		//c1.m2();
		
	}

}
