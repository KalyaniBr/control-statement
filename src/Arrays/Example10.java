package Arrays;

import java.util.Arrays;

public class Example10 {
public static void main(String[] args) {
	
	int[]ar= {20,53,75,6,894,};
	
	System.out.println(ar[2]);
	System.out.println(ar.length);
	
	
	Arrays.sort(ar);
	System.out.println("---print dta asending order-------");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
		
	}
	System.out.println("-----print data in descending order------");
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	
	
}
}
