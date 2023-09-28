package ExceptionHandling;

public class Sample3 {
public static void main(String[] args) {
	
	int a=10;
	int b=2;
	int div=0;
	
	try
	{
		div=a/b;  //risky code
	}
	catch(ArithmeticException j)
	{
		System.out.println("ArithmeticException");
	}
	
	System.out.println(div);
	System.out.println("hii");
	System.out.println("gm");
	
	
	
}
}
