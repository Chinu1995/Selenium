package test;

public class star {
	public static void printstars(int n) {
	int i,j;
	for(i=0;i<n;i++) {
		for(j=0;j<=i;j++) {
			System.out.print(" *");
			
		}
		System.out.println("");
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
printstars(n);
	
	}
	
	
}
	


