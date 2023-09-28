package arrays_ex;

import java.util.Arrays;

public class Sample6 {
public static void main(String[] args) {
	
	int []ar=new int[5]; 
	
	ar[0]=1;
	ar[1]=2;
	ar[2]=3;
	ar[3]=4;
	ar[4]=5;
	
	System.out.println(ar.length);
	System.out.println(ar[1]);
	
	System.out.println("-----printing all data------");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	Arrays.sort(ar);
	System.out.println("------printing in asending order----");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("------printing in descending ordre---");
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
}
		
}
