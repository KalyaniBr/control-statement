package User_Def_Const_withoutparameter;

public class Example {

	int a;
	String s;
	
	Example()
	{
		a=25;
		s="Kalyani";
	}
	
	public void m1() {
		System.out.println("Name : "+s);
		System.out.println("age : " +a);
	}
	public static void main(String[] args) {
		Example obj=new Example();
		obj.m1();
		
		
		
		
	}
	
	
	
	
	
}
