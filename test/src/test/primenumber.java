package test;

public class primenumber {
	
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count=count+1;
				}
			}
			if(count==0) {
				System.out.println(i+"");
			}
			else {
				count=0;
			}
		}
	
	
	}
	}
		

	


