package user_def_const_withparameter;

public class Withpara2 {
int A;
String s;
Withpara2(int k,String L){
	A=k;
	s=L;	
}
public void s1() {
	System.out.println(A);
	System.out.println(s);
	System.out.println("name : "+s+" ,age : "+A);
}	
	public static void main(String[] args) {
		Withpara2 cop=new Withpara2(25,"Kalyani");
		cop.s1();
		Withpara2 pop=new Withpara2(26,"Jayashri");
		pop.s1();
		System.out.println("---------------------");
		Withpara3.x2();
		Withpara3 Try=new Withpara3("Good","Morning");
		Try.x1(); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
