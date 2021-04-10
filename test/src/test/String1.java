package test;

public class String1 {

	public static void main(String[] args) {
		//char ch[]={'s','t','r','i','n','g','s'};
		//String s=new String(ch);
	String	s="Welcome";
		System.out.println(s);
		String s1=new String("Welcome");//creates two objects and one reference variable
		System.out.println(s1);
		
		String s2="ravikanth";//creating string by java string literal  
		System.out.println(s2);
		System.out.println(s2.indexOf("v"));//	int indexOf(int ch)
		System.out.println(s2.indexOf("kan"));//int indexOf(String substring)
		System.out.println(s2.indexOf("a", 4));//a is printinting after 4th indexint indexOf(int ch, int fromIndex)
		String s3 = "This is indexOf method";         
		int index = s3.indexOf("method", 10); //Returns the index of this substring  
        System.out.println("index of substring "+index);//int indexOf(String substring, int fromIndex)
		
		System.out.println(s2.charAt(3));
		System.out.println(s2.length());
		
		String s4="Ravikanth";
		String s5="ravi";
		
		System.out.println(s2.equals(s4));
		System.out.println(s2.equalsIgnoreCase(s4));
		System.out.println(s4.contains(s5));
		System.out.println(s4.toLowerCase().contains(s2));
		System.out.println(s4.toLowerCase().contains(s5));
		System.out.println(s4.startsWith("ravi"));
		System.out.println(s4.toLowerCase().startsWith("ravi"));
		System.out.println(s4.endsWith("th"));
		System.out.println(s4.replace("a", "A"));
		String s6="my name is khan my name is java";  
		System.out.println(s6.replace("is", "was"));
		
		String s7="  hello string   "; 
		String s8="Hello string";
		System.out.println(s7);
		System.out.println(s7.trim());
		System.out.println(s8.equalsIgnoreCase(s7.trim()));
		System.out.println(s8.toLowerCase().equals(s7.trim()));
		String s9="java string split method";  
		 String[] str=s9.split(" ");////splits the string based on whitespace  
		 for(int i=0;i<str.length;i++) {
			 System.out.println(str[i]);
		 }
		 for(String w:str){  
			 System.out.println(w);  
			 }  
		 System.out.println("returning words:");  
		 for(String w:s9.split("\\s",0)){  
		 System.out.println(w);  
		 }  
		 System.out.println("returning words:");  
		 for(String w:s9.split("\\s",1)){  
		 System.out.println(w);  
		 }  
		 System.out.println("returning words:");  
		 for(String w:s9.split("\\s",2)){  
		 System.out.println(w);  
		 }  

		
		
		
		}

}
