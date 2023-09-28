package Arrays;

public class Example6 {
public static void main(String[] args) {
	
	//int[][]ar=new int[2][3];
	
	int[][]ar= {{10,20,30},{40,50,60}};
			
		System.out.println(ar.length);	
	  System.out.println(ar[0][1]);
	  
	  System.out.println("To print all data");
	  
	  for(int i=0;i<=1;i++)
	  {
		  for(int j=0;j<=2;j++)
		  {
			  System.out.print(ar[i][j]+" ");
		  }
		  System.out.println();
	  }
}
}
