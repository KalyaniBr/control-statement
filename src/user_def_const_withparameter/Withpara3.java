package user_def_const_withparameter;

public class Withpara3 {
String l;
String w;


Withpara3(String o,String f)
{
	l=o;
	w=f;
}
public void x1() {
	System.out.println(l);
	System.out.println(w);
	System.out.println(l+"  "+w);
}
public static void x2() {
	Withpara3 sec=new Withpara3("Welcome","Home");
	System.out.println(sec.l);
	System.out.println(sec.w);
}


}