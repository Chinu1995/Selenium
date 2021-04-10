package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checkedexception {

	/*
	 * public static void main(String[] args) throws FileNotFoundException {
	 * 
	 * BufferedReader br=new BufferedReader(new FileReader("input.txt")); }
	 */
	
	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
