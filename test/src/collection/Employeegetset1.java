package collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Employeegetset1 {

	public static void main(String[] args) {
		HashMap<Integer,Employeegetset> hm=new HashMap<Integer,Employeegetset>();
		Employeegetset e1=new Employeegetset(101, "chinu1");
		Employeegetset e2=new Employeegetset(102, "chinu2");
		Employeegetset e3=new Employeegetset(103, "chinu3");
		Employeegetset e4=new Employeegetset(104, "chinu4");
		
		hm.put(e1.getEmpid(), e1);
		hm.put(e2.getEmpid(), e2);
		hm.put(e3.getEmpid(), e3);
		hm.put(e4.getEmpid(), e4);

		 Set<Entry<Integer, Employeegetset>> entries = hm.entrySet();
		for(Entry<Integer,Employeegetset> emp:entries) 
		{
			System.out.println(emp.getKey());
			Employeegetset employee=emp.getValue();
			employee.display();
		}
	}

}
