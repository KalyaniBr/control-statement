package group1CS;

public class nested_if2 {
public static void main(String[] args)
{
	int R= 1050;
	if(R>=500)
	{
		System.out.println("No delivery chargrs are applied");
	
	if(R>=1000)
	{
		System.out.println("10% Discount applied");
	}
	else
	{
		System.out.println(" No Discount is applied");
	}
}
	else
	{
		System.out.println("Dilevery charges are applied");
	}
}
}
