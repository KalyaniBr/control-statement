package arrays_ex;

import java.util.Arrays;

public class array_sort {
public static void main(String[] args) {

	int[]ar=new int[5];
	
	ar[0]=9;
	ar[1]=6;
	ar[2]=35;
	ar[3]=2;
	ar[4]=7;
	
	System.out.println("---print original data----");
			
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	Arrays.sort(ar);
	
	System.out.println("-----print array in ascending order----");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("----print array in descending order-----");
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	
}	
}
