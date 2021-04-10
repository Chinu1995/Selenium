package test;

public class Calculation_con {
	int a,b,c;
	
public Calculation_con(int a, int b) {
		this.a=a;
		this.b=b;
	}
public void add() {
	c=a+b;
	System.out.println("add is:"+c);
		}	
public void sum() {
	c=a-b;
	System.out.println("add is:"+c);
		}	

public static void main(String[] args) {
		
Calculation_con cal=new Calculation_con(10,20);
cal.add();
cal.sum();
	}

}
