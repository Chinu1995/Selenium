package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExcep {

	public static void m1() throws FileNotFoundException {
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));//throws
	} 
	
	
	/*
	 
	 * public static void main(String[] args) throws FileNotFoundException {
	 * 
	 * m1(); //by using throws}
	 */
public static void main(String[] args) {
	try {
		m1();//by try catch
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
