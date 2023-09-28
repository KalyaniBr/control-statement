package User_Def_Const_withoutparameter;

public class UDCW2 {
int x;
int y;
  
UDCW2 ()  //user defined constuctor without parameter
{
	x=50;
	y=60;
}
	public void v() {
		System.out.println(x);
		System.out.println(y);
	
	}
	public static void k() { 
		String b="Kalyani";
		UDCW2 I= new UDCW2();
		System.out.println(I.x);
		System.out.println(I.y);
		System.out.println(b);
	}
	public static void main(String[] args) {
		UDCW2 Y=new UDCW2 ();
		Y.v();
		k();
		System.out.println(Y.x);
		System.out.println(Y.y);
		
	}
	
	
	
}
