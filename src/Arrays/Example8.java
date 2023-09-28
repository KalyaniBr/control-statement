package Arrays;

import java.util.Arrays;

public class Example8 {
public static void main(String[] args) {
	
	int[]ar=new int[5];
	
	ar[0]=100;
	ar[1]=200;
	ar[2]=600;
	ar[3]=50;
	ar[4]=250;
	
	System.out.println(ar[1]);
	System.out.println(ar.length);
	Arrays.sort(ar);
	System.out.println("------print alln data in asending order------");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("---print all data in descending order----------");
	
	
	for(int j=ar.length-1;j>=0;j--)
	{
		System.out.println(ar[j]);
	}
	
	
	
	
	
}
}
