package stringclass;

public class Sample8 {
public static void main(String[] args) {
	
	//object creation String-->without using keyword
	  String s1="abc";
	  String s2="efg";
	  String s3="hij";
	  
	  //object creation String--->using new keyword
	  
	  String s4=new String("abc");
	  String s5=new String("efg");	  
	  String s6=new String("hij");
	  
	  s4=s4+"xyz";  //abc+xyz
	  System.out.println(s4);
	  
	  s4=s4+"abc";  //abcxyz+abc
	  
	  
	  System.out.println(s4);
	  
	  s4=s4+"Kalyani";
	  
	  System.out.println(s4);
	  
	  
	  
	  
	
}
}
