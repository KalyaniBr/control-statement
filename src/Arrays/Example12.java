package Arrays;

import java.util.Arrays;

public class Example12 {
public static void main(String[] args) {
	
	//int []ar= new int [5];
	
  	int ar[]= {10,20,30,40,50};
  		
  	System.out.println(ar[0]);
  	System.out.println(ar.length);
  	
  	System.out.println("print all data");
  	
  	for(int i=0;i<=ar.length-1;i++)
  	{
  		System.out.println(ar[i]);
  	}
  	Arrays.sort(ar);
  	
  	System.out.println("print data in asending order");
  	
  	for(int i=0;i<=ar.length-1;i++)
  	{
  		System.out.println(ar[i]);
  	}
  	System.out.println("print all data in descending order ");
  	for(int i=ar.length-1;i>=0;i--)
  	{
  		System.out.println(ar[i]);
  	}
  	
  	
}
}
