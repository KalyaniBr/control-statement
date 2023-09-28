package ExceptionHandling;

public class Sample5 {
public static void main(String[] args) {
	
	int []ar=new int[4];
	
	try
	{
		ar[5]=10;
	}
	catch(Exception s)
	{
		System.out.println("generic Exception Handled");
		s.printStackTrace();
	}
	
	System.out.println("Hello");
}
}
