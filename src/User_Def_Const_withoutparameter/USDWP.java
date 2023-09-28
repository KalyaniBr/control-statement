package User_Def_Const_withoutparameter;

public class USDWP {

	int a;
	int b;
	String s;
	USDWP()
	{
		a=10;
		b=20;
		s="Bramhankr";
		
		
	}
	
	public void m1() {
		
		System.out.println(a+b);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		USDWP copy1=new USDWP();
		copy1.m1();
		
		
	}
	
	
	
}
