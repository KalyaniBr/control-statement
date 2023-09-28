package Arrays;

public class Example14 {
public static void main(String[] args) {
	
	int [][]ar= {{1,2,3,},{4,5,6},{6,7,8}};
	
	System.out.println(ar[1][1]);
	System.out.println(ar.length);
	
	System.out.println("Print all data");
	
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
