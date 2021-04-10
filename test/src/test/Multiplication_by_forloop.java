package test;

public class Multiplication_by_forloop {

	public static void main(String[] args) {
//(1)		//int n=2;
		
		/*
		 * for(int i=1;i<=10;i++) { System.out.println(n+"*"+i+"="+n*i); }
		 */
		/*
		 
//(2)	 
		 
		 * for( int i=1;i<=10;i++) { for(int j=1;j<=10;j++) {
		 * System.out.println(i+"*"+j+ "=" +i*j); }
		 * 
		 * }
		 */
//(3)
		
		for( int i=1;i<=10;i++) { 
			for(int j=1;j<=10;j++) {
				System.out.print(i+"*"+j+ "=" +i*j+"  ");
			}
			System.out.println();
		}
	}

}
