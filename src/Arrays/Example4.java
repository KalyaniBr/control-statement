package Arrays;

public class Example4 {
public static void main(String[] args) {
	
	int[][]ar= {{1,2,3},{4,5,6},{7,8,9}};
	
	System.out.println(ar.length);
	System.out.println(ar[2][2]);
	
	System.out.println("----print all data--------");
	
	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=2;j++)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
