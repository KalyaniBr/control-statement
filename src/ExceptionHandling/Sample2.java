package ExceptionHandling;

public class Sample2 {
public static void main(String[] args) {
	
	String s="abcd";
	
	try
	{
		System.out.println(s.charAt(5));  //risky code
	}
	
	catch(StringIndexOutOfBoundsException a)
	{
		System.out.println("hiiii");
	}
	
	System.out.println("good morning");
	
}
	
	
}
