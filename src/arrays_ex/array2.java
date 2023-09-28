package arrays_ex;

public class array2 {
public static void main(String[] args) {
	
	String []ar=new String[5];
	
	ar[0]="Kalyani";
	ar[1]="Bramhankar";
	ar[2]="Good Morning";
	
	System.out.println(ar[1]);
	System.out.println(ar.length);
	
	System.out.println("-print all data------");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	
	
}
	
	
	
	
}
