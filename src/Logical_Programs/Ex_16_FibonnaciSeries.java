package Logical_Programs;

public class Ex_16_FibonnaciSeries {
public static void main(String[] args) {
	
	//fibonnaci from 1 to 10
	int n1=0, n2=1, n3;
	
	System.out.print(n1+" "+n2);//print 0 and 1
	for(int i=2;i<10;i++)//loop starts from 2 because 0 and 1 already printed
	
	{
		n3=n1+n2;
		System.out.print(" "+n3);	
		n1=n2;
		n2=n3;
	}
	
	
}
}
