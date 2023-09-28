package star_pattern;

public class demo7 {
public static void main(String[] args) {
	
	int star=10;
	                         
	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		star=star-2;
	}
	
}
}
