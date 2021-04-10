package test;

public class Empdemochild extends empdemo {

	String city;
 
	
	
	


	public Empdemochild(String city) {
		//super();
		super(100);
		//super(100,"sam");
		//super(165,"ram",12.5f);
		this.city=city;
		System.out.println(this.city);
		
	}



	public static void main(String[] args) {
		Empdemochild e1=new Empdemochild("hyd");

	}

}
