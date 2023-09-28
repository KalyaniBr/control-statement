package Nested_if;

public class Sample1 {
public static void main(String[] args) {
	int i=1200;
	
	if(i>=500)
	{
		System.out.println("Free Delivery");
		if(i>=1000)
		{
			System.out.println("10% Discount");
		}
		else
		{
			System.out.println("No Discount");
		}
	}
	else
	{
		System.out.println("Delivery charges applicable");
	}
}
}
