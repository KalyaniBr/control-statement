package ExceptionHandling;

public class Sample6 {
public static void main(String[] args) {
	
	int[]ar=new int[4];
	
	try
	{
		ar[5]=10;    //risky code
		
	}
	catch(ArithmeticException s1)
	{
		System.out.println("ArithmeticException handled");
	}
	catch(StringIndexOutOfBoundsException s2)
	{
		System.out.println("StringIndexOutOfBoundsException");
	}
	catch(ArrayIndexOutOfBoundsException s3)
	{
		System.out.println("ArrayIndexOutOfBoundsException");
	}
	catch(Exception s4)
	{
		System.out.println("generic Exception handled");
	}
	
	System.out.println("Hello...");
	
}
}
