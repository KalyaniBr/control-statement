package group1CS;

public class Else_if5 {
public static void main(String[] args) {
	int marks= 88;
	if(marks>=75)
	 {
		System.out.println("pass with distinction");
	 }
	else if(marks>=60 & marks<=74)
	 {
		 System.out.println("First Class");
	 }
	else if(marks>=55 & marks<=59)
	 {
		 System.out.println("2nd class");
	 }
	 else if(marks>=35 & marks<=54)
	 {
		 System.out.println("Pass");
	 }
	 

	else
	{
		System.out.println("Fail");
	}
}
}