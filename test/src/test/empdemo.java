package test;
//constructor
public class empdemo {
int eno;
String ename;
float esal;
public empdemo() {
	System.out.println("im default");
	System.out.println(this.eno);
	System.out.println(this.ename);
	System.out.println(this.esal);
}

	public empdemo(int eno) {
		this();
	this.eno=eno;
	System.out.println(this.eno);
	System.out.println(this.ename);
	System.out.println(this.esal);
	
}

	public empdemo(int eno, String ename) {
		this(143);
		this.eno=eno;
		this.ename=ename;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.esal);
	}

	public empdemo(int eno, String ename, float esal) {
		this(144,"babul");
		this.eno=eno;
		this.ename=ename;
		this.esal=esal;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.esal);
	}

	public static void main(String[] args) {
		
//empdemo e1=new empdemo();
//System.out.println(e1.eno);
//System.out.println(e1.ename);
//System.out.println(e1.esal);

//empdemo e2=new empdemo(111);
//System.out.println(e2.eno);
//System.out.println(e2.ename);
//System.out.println(e2.esal);

//empdemo e3=new empdemo(112,"chinu");
//System.out.println(e3.eno);
//System.out.println(e3.ename);
//System.out.println(e3.esal);

empdemo e4=new empdemo(113,"sai",123.5f);
//System.out.println(e4.eno);
//System.out.println(e4.ename);
//System.out.println(e4.esal);

	}

}
