package Arrays;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		int[]ar= {400,500,600,100};
		
		System.out.println(ar[3]);
		System.out.println(ar.length);
		
		System.out.println("------print all data--------");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		
		System.out.println("---------Print all data in ascending order---------");
		for(int i=0;i<=ar.length-1;i++)
		{
			
			System.out.println(ar[i]);
		}
		System.out.println("---------Print all data in descending order---------");
		for(int i=ar.length-1;i>=1;i--)
		{
			
			System.out.println(ar[i]);
		}

		
		
	}
	
	
	
	
}
