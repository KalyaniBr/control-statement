package User_Def_Const_withoutparameter;

public class UDCW5 {

	char C;
	float f;
	double d;
	UDCW5()
	{
	C='A';	
	f=89.98f;
	d=234.987d;
		}
	
	public void l1() {
		System.out.println(C);
		System.out.println(f+d);
	}
	public static void l2() {
		UDCW5 KAL=new UDCW5();
		System.out.println(KAL.C);
		System.out.println(KAL.f);
		System.out.println(KAL.d);
	}
public static void main(String[] args) {
	UDCW5 TRY=new UDCW5();
	TRY.l1();
	//from diff class
	UDCW6 Ex=new UDCW6();
	Ex.line();
	l2();
	
}	
	
	
	
	
	
	
	
	
	
}
