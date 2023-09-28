package ExceptionHandling;

public class Practice {
public static void main(String[] args) {
	
	String []ar= new String [3];

	
	
	try
	{
		ar[3]="good";
	}
	catch(ArrayIndexOutOfBoundsException a)
	{
		System.out.println("Exception Handled");
	}
	catch(StringIndexOutOfBoundsException b)
	{
		System.out.println("Exception Handled");
	}
	catch(NullPointerException b)
	{
		System.out.println("Exception Handled");
	}
catch(Exception d)
	{
	System.out.println("Exception Handled");

	}
	System.out.println("hii");
}
}
