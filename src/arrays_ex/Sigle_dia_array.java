package arrays_ex;

public class Sigle_dia_array {
public static void main(String[] args) {
	
	int []ar=new int [5];
	ar[0]=100;		
	ar[1]=20;
	ar[2]=39;
	ar[3]=40;
	
	System.out.println(ar[2]);
	System.out.println(ar.length);
	
	System.out.println("------print all data in ascending order-------");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("----print all data in descending order-----");
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	
	
	
	
	
	
	
	
	
}
}
