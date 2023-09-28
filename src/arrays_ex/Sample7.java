package arrays_ex;

import java.util.Arrays;

public class Sample7 {
public static void main(String[] args) {
	
	int[]ar=new int[4];
	
	ar[0]=10;
	ar[1]=20;		
	ar[2]=30;
	ar[3]=40;
	
	System.out.println(ar.length);
	System.out.println(ar[3]);
	
	System.out.println("Print all data");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	Arrays.sort(ar);
	
	System.out.println("print in ascending order");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("print in descending order");
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
		
}
	
}
