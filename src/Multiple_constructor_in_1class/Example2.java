package Multiple_constructor_in_1class;

public class Example2 {

	int g;
	int h;
	String s;
	
	Example2(int a,int b,String f)
	{
		g=a;
		h=b;
		s=f;
		
	}

	
	
	public void m1() {
		
		System.out.println(g+h);
		System.out.println(g*h);
		System.out.println(s);
	}
	public static void main(String[] args) {
		Example2 copy1=new Example2(10,20,"JAYASHRI");
		copy1.m1();
		
	}
	
	
}
