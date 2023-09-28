package ExceptionHandling;

public class sample4 {
public static void main(String[] args) {
	
	int[]ar=new int[4];
	
	try
	{
		ar[5]=10;
	}
	catch(ArithmeticException e)
	{
		System.out.println("ArithmeticException");
	}
	catch(StringIndexOutOfBoundsException z)
	{
		System.out.println("StringIndexOutOfBoundsException");
	}
	catch(ArrayIndexOutOfBoundsException s)
	{
		System.out.println("ArrayIndexOutOfBoundException");
	}
	System.out.println("Hello");
}
}
