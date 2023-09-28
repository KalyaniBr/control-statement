package Arrays;

import java.util.Arrays;

public class Example7 {
public static void main(String[] args) {
	
	int[]ar= {10,20,30,40,50};
	
	System.out.println(ar.length);
	System.out.println(ar[3]);
	
	System.out.println("Print all data");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	Arrays.sort(ar);
	System.out.println("In descending order");
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
}
}
