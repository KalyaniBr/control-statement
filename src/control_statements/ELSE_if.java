package control_statements;

public class ELSE_if {
public static void main(String[] args) {
	int marks=95;
	if(marks>=65 )
	{
		System.out.println("distinction");
	}
	else if(marks>=60 & marks<=64)
	{
		System.out.println("First class");
	}
	else if(marks>=35 & marks<=60)
	{
		System.out.println(" Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
