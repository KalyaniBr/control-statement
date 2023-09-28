package user_def_const_withparameter;

public class withpara6{
	int i;
	int e;
	String d;
	String f;
	withpara6(int j,int t,String c,String u)
	{
	i=j;
	e=t;
	d=c;
	f=u;
		
	}
	public void M1(int k,String g) {
		System.out.println(i+e);
		System.out.println(d+"  "+f);
		System.out.println(d);
		System.out.println(i+f );
		System.out.println(k);
		System.out.println(g);
	}
	public static void main(String[] args) {
		withpara6 Xerox=new withpara6(12,34,"Kalyani","Bramhankar");
		Xerox.M1(34,"Good");
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
