package group1CS;

public class if_6 {
public static void main(String[] args) {
	int marks=34;
	if(marks>=75)
	{
		System.out.println("Pass with Distinction");
	}
	else if(marks<=74 & marks>=60)
	{
		System.out.println("1 St class");
	}
	else if(marks<=60 & marks>=55)
	{
		System.out.println("2 nd class");
	}
	else if(marks<=54 & marks>=35)
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}

}
}
