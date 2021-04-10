package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsMethodtry {
	public static void m1()  {
		try {
			BufferedReader br=new BufferedReader(new FileReader("input.txt"));//try-catch
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	public static void main(String[] args) {
		m1();

	}

}
