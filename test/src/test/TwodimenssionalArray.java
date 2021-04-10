package test;

public class TwodimenssionalArray {

	public static void main(String[] args) {
		int [][] a= {
				{1,2,3,4},
				{4,5,6,8},
				{7,8,5,3},
				{4,8,2,3}
			};
for(int i=0;i<4;i++) {
	for(int j=0;j<4;j++) {
		//System.out.println(a[i][j]);
		System.out.print(a[i][j]+"  ");
	}
	System.out.println();
	
}
System.out.println("**********************");
		int [][] b= {
						{1,2,3,5,11},
						{4,5,6,8},
						{7,8,5,3},
						{4,8,2,3,2,13},
						{2,2}
					};
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				//System.out.println(a[i][j]);
				System.out.print(b[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");

		/*for(int k[]:b) {
			for(int l:k) {
				System.out.print(" "+l);
	}
	System.out.println();}*/
		
			    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
			    for (int i = 0; i < 2; ++i) {
			      for(int j = 0; j < myNumbers[i].length; ++j) {
			        System.out.print(myNumbers[i][j]);
			      }
			    }
			  }
			

	}


