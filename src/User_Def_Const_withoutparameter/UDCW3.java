package User_Def_Const_withoutparameter;

public class UDCW3 {
 int i;
 int j;
 
 UDCW3 ()
 {
	 i=45;
	 j=55;
	 
 }
public void O() {
	System.out.println(i+j);
	System.out.println(j*j);
	System.out.println(j-i);
}

public static void main(String[] args) {
	UDCW3 T=new UDCW3();
	System.out.println(T.i);
	System.out.println(T.j);
	T.O();
}
	
}
