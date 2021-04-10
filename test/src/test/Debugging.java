package test;

import java.util.Scanner;

public class Debugging {
public int m1()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size:");
	int aSize=sc.nextInt();//read user input
	int a[]=new int [aSize];
	int sum=0;
	System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum=sum+a[i];
				}
		System.out.println("sum of array is:"+sum);
		return sum;
		}	



	public static void main(String[] args) {
		
		Debugging obj=new Debugging();
		int count=obj.m1();
		System.out.println("sum of array outside method:"+count);
	}

}
