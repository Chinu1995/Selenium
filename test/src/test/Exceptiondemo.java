package test;

import java.util.Scanner;

public class Exceptiondemo {

	public static void main(String[] args) {
		int nr,dr,result;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter numerator value: ");
			nr = sc.nextInt();
			System.out.println("enter denominator value: ");
			dr = sc.nextInt();
			//int nr=100,dr=0,result;
			try {
				result = nr / dr;
				System.out.println("divide is:" + result);
				break;//to stop execution after it becomes true
			} catch (ArithmeticException a) {
				// TODO Auto-generated catch block
				//a.printStackTrace();
				//System.out.println(a);
				System.out.println("denominator value should be greater than zero");
			} 
		}
		
		
	}

}
