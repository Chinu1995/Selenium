package test;

public class Calculation_child extends Calculation_con {
	

	public Calculation_child(int a, int b) {
		super(a,b);
	}

	public static void main(String[] args) {
		Calculation_child cl=new Calculation_child(100,200);
		cl.add();
		cl.sum();

	}

}
