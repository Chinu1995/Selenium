package test;

public class calculator {
	int x=4;
	int y=2;
	int sum=x+y;
	int sub=x-y;
	int mul=x*y;
	int div=x/y;
	int module=x%y;
	void addition() {
		System.out.println("addition="+sum);
	}
	void subtraction(){
		System.out.println("subtraction="+sub);
	}
	void multiplication() {
		System.out.println("multiplication="+mul);
	}
	void division() {
		System.out.println("division="+div);
	}
	void module() {
		System.out.println("mod="+module);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator obj=new calculator();
		obj.addition();
		obj.subtraction();
		obj.multiplication();
		obj.division();
		obj.module();
	}

}
