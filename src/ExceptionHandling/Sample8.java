package ExceptionHandling;

public class Sample8 {
public static void main(String[] args) {
	
	int []ar= new int[4];
	
	try 
	{
		try
		{
			ar[5]=50;
			
		}
		catch( ArrayIndexOutOfBoundsException a)
		{
			System.out.println("ArraysOutOfBoungException");
		}
		ar[6]=100;
				
	}
	catch(ArrayIndexOutOfBoundsException a)
	{
		System.out.println("Hello");
	}
}
}
