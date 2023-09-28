package arrays_ex;

import java.util.Arrays;


public class Sample1 {

	public static void main(String[] args) {
		
		int[]ar=new int[4];
		
		ar[0]=1;
		ar[1]=2;
		ar[3]=7;
		ar[4]=0;
		
		
	System.out.println(ar[3]);
		System.out.println(ar.length);
		
	System.out.println("------print all data----------------");	
		
	for(int i=0;i<=ar.length-1;i++)	
	{
		System.out.println(ar[i]);
	}

	Arrays.sort(ar);
	System.out.println("---in ascending order----");	
	for(int i=0;i<=ar.length-1;i++)	
	{
		System.out.println(ar[i]);
	}
	System.out.println("---in desceding order----");	
	for(int i=ar.length-1;i>=0;i++)	
	{
		System.out.println(ar[i]);
	}
		
	
	
	
	}
	
	
	
	
}
