package star_pattern;

public class pattern7 {

	public static void main(String[] args) {
		
	
	int space=3;  //star in first row
	int star=1;
	
	for(int i=1;i<=4;i++)
	{
		for(int k=1;k<=space;k++) //no of rows
		{
			System.out.print(" ");
		}
		for(int l=1;l<=star;l++)     
		{
			System.out.print("*");
		}
		System.out.println();
		star++;
		space--;
	}
	

	
}
}