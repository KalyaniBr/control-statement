package Logical_Programs;

public class Ex10_Prime_Num {
public static void main(String[] args) {
	
	int num=6;
	int count=0;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			count++;
			break;
		}
	}
	if(count==1)
	{
		System.out.println("Given num is not prime");	
	}
	else
	{
		System.out.println("Given num is Prime");
	}
	
} 
}
