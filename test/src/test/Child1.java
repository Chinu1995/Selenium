package test;
class parent1{
	 Number test() {
		System.out.println("im parent");
		return null;
	}

	
}
 class Child1 extends parent1 {
	 Integer test() {
		System.out.println("im child1");
		
		return null;
	}
	public void test1() {
		System.out.println("im child");
	}

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");
parent1 obj=new parent1();
obj.test();
Child1 obj1=new Child1();
obj1.test1();
obj1.test();
parent1 obj2= new Child1();
obj2.test();
	}

 }
