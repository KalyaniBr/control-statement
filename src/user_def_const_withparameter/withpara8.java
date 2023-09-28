package user_def_const_withparameter;

public class withpara8 {
	 int v;
     String S;
     char c;
     float f;

withpara8(int k,String l,char w,float y)
{
     v=k;
     S=l;
     c=w;
     f=y;
       }
public void meth1() {
	System.out.println(v+c);
	System.out.println(S);
	System.out.println(c);
	System.out.println(f);
}
public static void main(String[] args) {
	
	withpara8 Copy=new withpara8(35,"Kalyani",'A',56.84f);
	Copy.meth1();
	
}















}

