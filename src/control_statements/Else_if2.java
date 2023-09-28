package control_statements;

public class Else_if2 {
public static void main(String[] args) {
	int marks=25;
	if(marks>=65)
	{
		System.out.println("Distiction");
	}
	else if (marks<=64 & marks>=60)
	{
		System.out.println("First class");
	}
	else if (marks<=59 & marks>=55)
	{
		System.out.println(" Second class");
	}
	else if (marks<=50 & marks>=35)
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
