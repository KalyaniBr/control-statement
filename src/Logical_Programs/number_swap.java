package Logical_Programs;

public class number_swap {
public static void main(String[] args) {
	
	//logic 1 without using third variable
	
	int a=10;
	int b=20;
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
	
	//using third variable
	
	int t=2;
	int u=3;
	int v;
	
	v=t;
	t=u;
	u=v;
	System.out.println(t);
	System.out.println(u);
}
	
	
	
	
	
	
	
	
	
}
