package star_pattern;

public class pattern10 {
public static void main(String[] args) {
	
	int space=3;
	int star=1;
	for(int i=1;i<=4;i++)
	{
		for(int s=1;s<=space;s++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		star=star+2;
		space--;
	}
	
	
	
}
}
