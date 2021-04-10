package test;

public class assignment2 {
	public static void printstars(int n) {
		int i,j,num=1;
		for(i=0;i<n;i++) {
			
			for(j=0;j<=i;j++) {
				System.out.print(num+" ");
				num++;
				
			}
			System.out.println("");
		}

		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int n=6;
	printstars(n);
		
		}

}
