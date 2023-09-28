package star_pattern;

public class pattern13 {
public static void main(String[] args) {
	
	//   *
	//  ***
	// *****
	//*******
	// *****
	//  ***
	//   *
	int space=3;
	int star=1;
	for(int i=1;i<=7;i++)
	{
		for(int s=1;s<=space;s++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		
		System.out.println();
		
		if(i<4)
		{
			star=star+2;
			space--;
		}
		else
		{
			star=star-2;
			space++;
		}
		
	}
	
	
	
	
	
	
	
}
}
