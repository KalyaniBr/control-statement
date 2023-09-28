package default_constructor;

public class Sample1 {
 //Ex. Default costructor
 // default constructor-->provided by compiler
	//use : to copy all the members of class into object
	//sample1()
	//{
	
	//  default constructor
	
	// }
	public void m1() {
		System.out.println("when we dont provide costructor to program ,compiler use default constructor");
		
	}
	public static void m2() {
		System.out.println("running from diff class");
	} 
	public static void main(String[] args) {
		m2();
		Sample1 s1=new Sample1();
		s1.m1();	
	
	// Sample1=classname-->datatype
	// s1=objectname-->to identify/refer object
	// new=-->keyword-->to create-->blankblank/empty object
	System.out.println("---------------------");
	Sample2 s2=new Sample2();
	s2.m3();
	}
}
