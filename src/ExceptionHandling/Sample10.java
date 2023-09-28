package ExceptionHandling;

public class Sample10 {
public static void main(String[] args) {
	
	String s="Kalyani";
	
	try
	{
		System.out.println(s.charAt(10));
	}
	catch(StringIndexOutOfBoundsException r)
	{
		System.out.println("Exception Handled");
	}
	catch(ArithmeticException f)
	{
		System.out.println("artimetic");
	}
	catch(Exception d)
	{
		System.out.println("Exeption");
	}
	System.out.println("Hello");
}

}
