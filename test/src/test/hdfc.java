package test;

public class hdfc implements Rbi{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hdfc obj=new hdfc();
		obj.withdrawl();
		obj.deposite();
	}

	@Override
	public void withdrawl() {
		System.out.println(" im overridden from withdrawl in hdfc");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println(" im overridden from deposite in hdfc");
	}

}
