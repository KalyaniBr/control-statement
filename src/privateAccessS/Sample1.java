package privateAccessS;

public class Sample1 {

	//1. example of private access specifier
	private int a;
	private Sample1()
	{
		a=10;
	}
	private void squareofnum()
		{
			System.out.println(a*a);
		}
	 
	
       public static void main(String []args)
       {
    	 Sample1 copy1=new Sample1();
    	 copy1.squareofnum();
    	   System.out.println(copy1.a);
    	   
       
	
	
	
	
	
	
	
	
	
	
	}	
	
}
