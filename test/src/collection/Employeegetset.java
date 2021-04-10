package collection;

public class Employeegetset {
private int empid;
private String empName;



	public Employeegetset(int empid, String empName) {
	super();
	this.empid = empid;
	this.empName = empName;
}


	

	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void display() {
		System.out.println("Emp id="+getEmpid()+"  Emp name:"+getEmpName());
}
}
