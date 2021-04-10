package test;

public class string {
	public void stringfuc() {
		String s1="hello";
		
		String s2=new String("hii");
		String s3="hello";
System.out.println(s1);
System.out.println(s2);

s1 = s1.concat(s2); 
System.out.println(s1); 

s1=s1.replace("hello", " student ");
System.out.println(s1);
s1=s1.intern();
System.out.println(s1==s2);
s1=s3.intern();
System.out.println(s1==s3);
	}

	public static void main(String[] args) {
		string obj=new string();
		obj.stringfuc();

	}

}
