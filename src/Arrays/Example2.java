package Arrays;

public class Example2 {
public static void main(String[] args) {
	
	int[][]ar= {{10,20,30},{40,50,60}};
	
	System.out.println(ar[0][1]);
	System.out.println("------print all data-----");
	
	for(int i=0;i<=1;i++)//clm
	{
		for(int j=0;j<=2;j++)//rows
		{
			System.out.print(ar[i][j] +" ");
		}
		System.out.println();
	}

	
	
	
}
	
	
}
