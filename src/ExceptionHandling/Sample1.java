package ExceptionHandling;

public class Sample1 {
public static void main(String[] args) {
	
	int[]ar=new int[4]; //0-3
	
	//ar[4]=10;  //risky code-->because limit of array is only 0-4 to handle this exception need to use try and catch
	
	try
	{
		ar[4]=10;  //risky code
	}
	catch(ArrayIndexOutOfBoundsException e)
	// Exception name object name(e)
	{
		System.out.println("Exception Handled");
	}
	
	System.out.println("Hello");
	
	
	
}
	
}
