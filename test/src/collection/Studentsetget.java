package collection;

public class Studentsetget {
	private int sno;
	private String sname;
//private int sno=1744;
//private String sname="chinu";


	public int getSno() {
	return sno;
}


public void setSno(int sno) {
	this.sno = sno;
}


public String getSname() {
	return sname;
}


public void setSname(String sname) {
	this.sname = sname;
}


	public static void main(String[] args) {
		Studentsetget s=new Studentsetget();
		System.out.println(s.sno);
		System.out.println(s.sname);

	}

}
