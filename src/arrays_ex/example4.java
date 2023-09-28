package arrays_ex;

public class example4 {
public static void main(String[] args) {
	
	int[]ar=new int[4];
	
	ar[0]=10;
	ar[1]=20;
	ar[2]=5;
	ar[3]=70;
	
	System.out.println("------print original data-------");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	System.out.println("------print array in reverse order------");
	
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
}
	
	
	
}
