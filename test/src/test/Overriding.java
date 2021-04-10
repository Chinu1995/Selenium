package test;

class fart {
	public void workHard() 
	{
		System.out.println("parent:wakeup early....");
	}
	public void care() 
	{
		System.out.println("parent:almost care....");
	}
}
 public class Overriding extends fart{
	
	public void workHard() 
	{
		System.out.println("child:wakeup early....");
	}
	public void love() 
	{
		System.out.println("child:im in love....");
	}
	public static void main(String[] args) {
		Overriding o=new Overriding();
		o.love();
	o.care();
	o.workHard();
	
	fart f=new fart();
	f.care();
	f.workHard();
	fart f1=new Overriding();
	//f1.love();
	f1.care();
	f1
	.workHard();
	}
 }
 