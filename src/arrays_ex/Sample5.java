package arrays_ex;

import java.util.Arrays;

public class Sample5 {
public static void main(String[] args) {
	
	int[]ar=new int[5];
	
	ar[0]=100;
	ar[1]=500;
	ar[2]=200;
	ar[3]=50;
	ar[4]=700;
	
	
	System.out.println(ar[2]);
	System.out.println(ar.length);
	
	System.out.println("----print all data------");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	Arrays.sort(ar);
	
	System.out.println("-----print data in ascending--------");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("---print data in dscending order------");
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
		
		
}
	
	
	
}
