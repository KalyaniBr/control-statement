package group1CS;

public class Else_if2 {
	public static void main(String[] args) {
		int marks=350;
		if(marks>=300)  //outer if
		{
			System.out.println("Eligible For Mains Exam");
			int main=600;
			if(main>=750)  // inner if
			{
				System.out.println("Got Selected");
		}
			else
			{
				System.out.println("Rejected");
			}
		}
			else
			{
				System.out.println("Fail");
			}
		
	}

}
