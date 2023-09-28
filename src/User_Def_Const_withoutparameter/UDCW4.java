package User_Def_Const_withoutparameter;

public class UDCW4 {
int R;
String s;
int u;
long l;
UDCW4 ()
{
	
	R=45;
	s="kalyani";
	l=9604842893l;
	u=123;
}
public void f1() {
	System.out.println(s);
	System.out.println(R);
	System.out.println(R+" : "+s);
}
public void f2() {
	System.out.println(l);
	System.out.println(u);
}
public static void main(String[] args) {
	UDCW4 OBJ=new UDCW4();
	OBJ.f1();
	OBJ.f2();
	
	
}








}
