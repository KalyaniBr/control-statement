package Else_CS;

public class Sample1 {
public static void main(String[] args) {
	
	int a=56;

			
	if(a>=75)	
	{
		System.out.println("Distinction");
	}
	else if(a<=74&a>=60)		
	{
		System.out.println("First class");
	}
	else if(a<=59&a>=45)
	{
		System.out.println("Second class");
	}
	else if(a<=49&a>=35)
	{
		System.out.println("Third class");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
