package test;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * int a[]= {10,20,30,40}; for(int i=0;i<a.length;i++) {
		 * //System.out.println(a[i]); System.out.println("a["+i+"]"+"="+a[i]); }
		 */

		Scanner sc=new Scanner(System.in);//create a scanner object
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
	}

}
