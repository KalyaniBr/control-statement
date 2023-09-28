package arrays_ex;

import java.util.Arrays;

public class example5 {
public static void main(String[] args) {
	
	int []ar=new int [5];
	
	 ar[0]=101;
	ar[1]=2;
	ar[3]=3;
	ar[4]=3;
	ar[2]=2;
	
	System.out.println(ar.length);
	System.out.println("---------Print all data----");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	Arrays.sort(ar);
	System.out.println("---Print all data in descending order---");
	
	for(int i=ar.length-1;i>=0;i--)
	
	{
		System.out.println(ar[i]);
	}
	String []arr=new String [5];
	
	arr[2]="Kalyani";
	arr[0]="Prabha";
	arr[1]="Priti";
	arr[4]="Surya";
	arr[3]="Monty";
	
	System.out.println(arr[3]);
	System.out.println(arr.length);
	System.out.println(ar.equals(arr));
}
}
