package Arrays;

public class Example3 {

	public static void main(String[] args) {
		
		String[][]ar= {{"Kalayni","Jaya","Geeta"},{"Ritesh","Dipesh","Shantu"}};
		
		System.out.println(ar[0][1]);
		System.out.println(ar.length); // show only rows length
		
		System.out.println("-----------print all data--------------");
		
		for(int i=0;i<=1;i++)
		{
			
		for(int j=0;j<=2;j++)
		{
			System.out.print(ar[i][j]+"  ");
		}
			
			System.out.println();
		}
		
		
		
	}
	
}
