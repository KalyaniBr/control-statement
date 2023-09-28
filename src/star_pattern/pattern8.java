package star_pattern;

public class pattern8 {
public static void main(String[] args) {
	
	          //****
			  // ***
			  //  **
			  //   *

	int star=4;
	int space=0;
	
	for(int i=1;i<=4;i++)
	{
		for(int s=1;s<=space;s++)
		{
			System.out.print(" ");
		}
		for(int l=1;l<=star;l++)
		{
		System.out.print("*");	
		}
		System.out.println();
		star--;
		space++;
	}
}
}
