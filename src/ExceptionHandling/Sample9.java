package ExceptionHandling;

public class Sample9 {
public static void main(String[] args) {
	
	int[]ar=new int[3];
	
	try
	{
		try
		{
		 ar[10]=20;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println();
		}
		ar[6]=50;
	}
	catch(ArrayIndexOutOfBoundsException h)
	{
		System.out.println();
	}
	System.out.println("Exception Handled");
	
	
}
}
