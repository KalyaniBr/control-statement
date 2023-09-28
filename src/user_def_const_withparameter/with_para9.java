package user_def_const_withparameter;

public class with_para9 {

	int a;
	int b;
	String c;
	
	with_para9(int d,int e,String f)
	{
		a=d;
		b=e;
		c=f;	
		
	}
	public void k1() {
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(c);
		System.out.println(a+" : "+c);
	}
	
	public static void main(String[] args) {
		with_para9 copy2=new with_para9(10,250,"Kalyani");
		copy2.k1();
		
	}
}
