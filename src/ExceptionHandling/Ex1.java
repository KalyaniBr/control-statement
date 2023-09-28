package ExceptionHandling;


public class Ex1 {
public static void main(String[] args) {
	
	int[]ar= {10,20,30};
	
	//ar[4]=40;
	
	try
	{
		ar[4]=40;
	}
	catch(ArrayIndexOutOfBoundsException s)
	{
		System.out.println("Exception is Handled");
	}
	System.out.println("Hello");
}
}
