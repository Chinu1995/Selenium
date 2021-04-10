package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList <Object> ltr=new LinkedList<>();
		ltr.add("Ram");
		ltr.add("venki");
		ltr.add("chiru");
		ltr.add("nagi");
		System.out.println(ltr);
		
	ListIterator<Object> li=ltr.listIterator();
	while(li.hasNext()) {
		String s=(String) li.next();
		if(s.equals("venki")) {
			li.remove();
		}
		else if(s.equals("nagi")){
			li.add("chaitanya");
		}
		else if(s.equals("chiru")) {
			li.set("charan");
		}
		
	}
	System.out.println(ltr);
	
	
	
	}

}
