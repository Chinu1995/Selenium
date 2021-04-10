package exception;

//package test;

import java.util.Scanner;

public class UserExcepDemo extends Exception {

	public UserExcepDemo(String string) {
		super(string);
	}

	public static void main(String[] args) throws UserExcepDemo  {
		String num;
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("Enter 10 digit AlphaNumeric : ");
				num = sc.nextLine();

				if (num.length() != 10) {
					throw new UserExcepDemo("Number should be 10 digit ");//create a constructor to mouseover
			
				}
				else
				{
					System.out.println(num);
					break;
				}
			} catch (UserExcepDemo e) {

				//e.printStackTrace();
				System.out.println(e);
		
			} 
			finally {
				System.out.println("im finally");
			}
		}
		
		
	}

}
