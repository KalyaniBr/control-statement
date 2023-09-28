package group1CS;

public class nested_if4 {
public static void main(String[] args) {
	int marks=29;
		if(marks>=35)
		{
			System.out.println("Pass");
		
			if(marks>=75) {
				System.out.println("Grade A");
			}
			if(marks>=65)
			{
				System.out.println("Grade B");
			}
			if (marks>=45)
			{
				System.out.println("Grade C");
			}
			else
			{
				System.out.println("Grade D");
			}
}
		else
		{
			System.out.println("Fail");
		}
}
}