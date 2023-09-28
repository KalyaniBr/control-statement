package Logical_Programs;

public class Ex15_Swap2numbers {
public static void main(String[] args) {
	// Using Third variable
	int a=10;
	int b=20;
	
	int c=a;
	a=b;
	b=c;
	
	System.out.println( a +"=valuen of a" );
	System.out.println(b+ "=value of b");
	
	// Without using 3rd variable
	
	a=a+b;  //10+20=30;
	b=a-b;  //30-20=10;
	a=a-b;  //30-10=20;
	
	
	
}
}
