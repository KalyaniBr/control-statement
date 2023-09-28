package Multiple_constructor_in_1class;

public class constructor_overloading {

	int a;
	int b;
	String s;
	
	constructor_overloading() //user defined without parameter
	{
		a=10;
		b=20;
		s= "Good Morning";
		
	}
	constructor_overloading(int c,int d) //with 2 int parameters
	{
		a=c;
		b=d;
	}
	constructor_overloading(String f) //with String parameter
	{
		s=f;
	}
	public void meth1() {
		System.out.println(a+b);
		System.out.println(s);
	}
	public void meth2() {
		System.out.println(s);
	}
	public static void main(String[] args) {
		constructor_overloading copy1 =new constructor_overloading();
		copy1.meth1();
		copy1.meth2();
		constructor_overloading copy2 =new constructor_overloading(10,20);
         copy2.meth1();
         copy2.meth2();
 		constructor_overloading copy3=new constructor_overloading("Welcome");
            copy3 .meth1();
            copy3.meth1();
	}
	
	
	
	
	
	
}
