package star_pattern;

public class pattern5 {
public static void main(String[] args) {
	
	int star=1;
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		star++;
	}
	
	System.out.println("------------------------");
	
	int st=1;
	for(int l=1;l<=6;l++)
	{
		for(int s=1;s<=st;s++)
		{
			System.out.print("*");
		}
		System.out.println();
		st=st+2;
	}
	
	
	
}
}
