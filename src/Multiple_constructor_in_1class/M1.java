package Multiple_constructor_in_1class;

public class M1 {

	
	
	int a;
	String s;
	int b;
	
	M1()
	{
		a=10;
		s="Kalyani";
		b=20;
	}
	
	M1(int x,int y,String v)
	
	{
		a= x;
		b=y;
		s=v;
	}
	
	M1(int d,int i)
	{
		a=d;
		b=i;
	}
	
	public void add() 
	{
		System.out.println(a+b);
		
	}
	public void name() 
	{
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		M1 G=new M1(2,3,"Kalya");
		G.add();
		G.name();
		
		
	}
	
	
	
}
