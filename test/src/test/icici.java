package test;

public class icici implements Rbi{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
icici i=new icici();
i.deposite();
i.withdrawl();
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println(" im overridden from withdrawl in icici");
	}

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println(" im overridden from dedpopsite in icici");
		
	}

}
