package arrays_ex;

import java.util.Arrays;

public class example6 {
public static void main(String[] args) {
	
	int []ar= {1,2,3,4,5};
	
	System.out.println(ar[3]);
	System.out.println(ar.length);
	System.out.println("print all data");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	Arrays.sort(ar);
	
	System.out.println("print in descending order");
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	
}
}
