package Arrays;

public class example15 {
public static void main(String[] args) {
	
	String [][]ar= {{"as","bs"},{"Ts","ms"},{"js","hs"}};
	
	System.out.println(ar[0][1]);
	System.out.println("-----------------");
	
	for(int i=0;i<=2;i++)//Rows
			
	{
       for(int j=0;j<=1;j++)//clms
       {
    	   System.out.print(ar[i][j]+" ");
       }
       System.out.println();
	}
	
	
	
}
}
