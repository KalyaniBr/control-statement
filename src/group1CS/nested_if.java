package group1CS;
                    // sir's example
public class nested_if {
public static void main(String[] args) {
	int pre =500;
	if( pre>=300)
	{
		System.out.println("Eligible for  Main exam");
	   int main=500;
		if(main>=450)
		{
         System.out.println("Got selected");		
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