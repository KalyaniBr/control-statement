package default_constructor;

public class Example2 {
 int c;
 String k;
 char d;
	
	Example2(int s,String f,char a)
	{
	c=s;
	k=f;
	d=a;
		
	}
	public void A1() {
		System.out.println(c);
		System.out.println(k);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Example2 E2=new Example2(50,"Kalyani",'X');
		E2.A1();
		Example2 E3=new Example2(60,"Bramhankar",'Z');
		E3.A1();

		
		
	}
	
	
	
	
}
