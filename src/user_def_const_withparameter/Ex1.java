package user_def_const_withparameter;

public class Ex1 {

	
	int a;
	int b;
	String s;
	
	Ex1(int x,int y,String v)
	{
		a=x;
		b=y;
		s=v;
	}
	
 public void M1() 
 {
	System.out.println(a*b);
	System.out.println(s);
}
	
	public static void main(String[] args) {
		
		Ex1 o=new Ex1(10, 2, "mee");
			o.M1();	

				
		
	}
	
	
	
	
	
	
	
}
