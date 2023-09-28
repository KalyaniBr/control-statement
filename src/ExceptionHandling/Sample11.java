package ExceptionHandling;

public class Sample11 {
public static void main(String[] args) {
	
	int[]ar=new int[3];
	
	try
	{
		ar[4]=10;
	}
  catch(ArrayIndexOutOfBoundsException a)
	{
		System.out.println("Exeption Handled");
	}
	
}
}
