package group1CS;

public class nested_if3 {
public static void main(String[] args) {
	int marks=76;
    if (marks>=35)
    {
	System.out.println("Pass");
	if(marks>=75)
	{
		System.out.println("Pass with Distinction");
	}
	if(marks>=60)
	{
		System.out.println("First class");
	}
	else
	{
		System.out.println("Third ClassS");
	}
}
    else
    {
    	System.out.println("Fail");
    }
}
}