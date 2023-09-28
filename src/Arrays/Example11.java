package Arrays;

public class Example11 {
public static void main(String[] args) {
	
	int[][]ar= {{10,20,30},{98,83,83},{72,82,86}};
	
	System.out.println(ar[0][1]);
	
	System.out.println("-----print all data-----------");
	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=2;j++)
		{
			System.out.print(ar[i][j]+"  ");
		}
		System.out.println();
	}
	
	
}
}
