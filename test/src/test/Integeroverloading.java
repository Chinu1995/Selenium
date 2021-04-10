package test;

public class Integeroverloading {

	int m1(Object o) {
		System.out.println("object arg method");
		return 0;
		
	}
	/*
	 * int m1(Number n) { System.out.println("number arg method"); return 0;
	 * 
	 * }
	 */

	/*
	 * int m1(Integer i) { System.out.println("integer arg method"); return i;
	 * 
	 * }
	 */
	public static void main(String[] args) {
		
		Integeroverloading obj=new Integeroverloading();
		obj.m1(10);//integer level->number->object
		}

	}


