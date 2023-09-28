package default_constructor;

public class Sample3 {
  public void m1() {
	System.out.println("Kalyani");
	
	
} 
	public static void m2() {
		System.out.println("Bramhankar");
	}
	
	public static void main(String[] args) {
		Sample3 Copy=new Sample3();
		Copy.m1();
		m2();
		
		//Sample3=classname-->datatype
		//copy-->objectname= to identify or refer object
		// Sample3-->classname-->constructor call-->copy all memberofclass into object
		
	}
	
}
