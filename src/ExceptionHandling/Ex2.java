package ExceptionHandling;

public class Ex2 {
public static void main(String[] args) {
	
	String S1="Kalyani";
	
	try
	{
		System.out.println(S1.charAt(8));
	}
	catch(StringIndexOutOfBoundsException a)
	{
		System.out.println("Exception is Handled");
	}
	
	System.out.println("Hello");
}
}
