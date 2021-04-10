package test;

public class Constructor {
	
	int eno;
	String s;
	float f;
	double d;
	public Constructor() 
	{
		System.out.println("im a default constructor");
	}
public Constructor(int eno, String s)
{
		
		this.eno=eno;
		this.s=s;
	}

	/*
	 * public Constructor(int i, String string) { // TODO Auto-generated constructor
	 * stub super(); eno=i; s=string;
	 * }
	 */




public Constructor(int eno, String s, double d) {
		super();
		this.eno = eno;
		this.s = s;
		this.d = d;
	}
public Constructor(int eno) {
	super();
	this.eno = eno;}


public static void main(String[] args) {
	Constructor c4= new Constructor();
	System.out.println(c4.eno);
	System.out.println(c4.s);
	System.out.println(c4.d);
	Constructor c=new Constructor(144,"chinu");
	System.out.println(c.eno);
	System.out.println(c.s);
	
	Constructor c2=new Constructor(145,"sai",1.5);
	System.out.println(c2.eno);
	System.out.println(c2.s);
	System.out.println(c2.d);
	
	Constructor c3=new Constructor(156);
	System.out.println(c3.eno);
}


}



