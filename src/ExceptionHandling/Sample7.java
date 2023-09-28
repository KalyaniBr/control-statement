package ExceptionHandling;

public class Sample7 {
public static void main(String[] args) {
	
 //we can create try block inside try block i.e nested try for multiple exception declaration
	
	try
	{
		try
		{
			//risky code 1
		}
		catch()
		{
			//todo: exception handle
		}
	}
	catch()
	{
		
	}
	
	//risky code 2
}
}
