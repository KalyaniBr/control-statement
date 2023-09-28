package ExceptionHandling;

public class Sample12 {
public static void main(String[] args) {
	
	String s=new String("Kalyani");
	String h=new String("BRAMHANKAR");
	try
	{
		System.out.println(s.charAt(9));
		System.out.println(h.indexOf("z"));
	}
	catch(StringIndexOutOfBoundsException k)
	{
		System.out.println("Exception Handled");
	}
	System.out.println("Hiii");
}
}
