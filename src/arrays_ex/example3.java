package arrays_ex;

public class example3 {
public static void main(String[] args) {
	
  char[]ar=new char[8]; //0 to 6	
	
	ar[0]='w';
	ar[1]='e';
	ar[2]='l';
	ar[3]='l';
	ar[4]='c';
	ar[5]='o';
	ar[6]='m';
	ar[7]='e';
	
	System.out.println(ar[6]);
	System.out.println(ar.length);
	
	System.out.println("-----print all data-----");
	
	// for( int i=0;i<=8;i++)
	//{
	//System.out.println(har[i]);
       //}
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
}
	
}
