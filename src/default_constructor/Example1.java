package default_constructor;

public class Example1 {

	int a;
	int b;
	String s;
	
	Example1()
	{
		a=10;
		b=20;
		s="Good Morning";
	}
	
	public void M1() {
		System.out.println(a+b);
	}
	
	public void M2() {
		System.out.println(s);
	}
	public static void main(String[] args) {
		Example1 E=new Example1();
		E.M1();
		E.M2();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
