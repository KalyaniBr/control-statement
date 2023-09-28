package arrays_ex;

public class Sample11 {
public static void main(String[] args) {
	
	int [][]ar= {{10,20,30,40,56},{56,74,84,30,39}};
	
	System.out.println(ar[1][4]);
	
	System.out.println("-----------print all data------------");
	
	for(int i=0;i<=1;i++)  //for rows
	{
		for(int j=0;j<=4;j++)  //for coloumns
		{
			System.out.print(ar[i][j]+"  ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
}
}
