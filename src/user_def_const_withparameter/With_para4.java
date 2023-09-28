package user_def_const_withparameter;

public class With_para4 {
int a;
int b;
String c;
char d;
float f;
long g;

With_para4(int h,String j,int i,char k,float l,long n)
{
a=h;
b=i;
c=j;
d=k;
f=l;
g=n;}

public void Line1() {
	System.out.println(a);
	System.out.println(b);	
	System.out.println(c);
	System.out.println(d);
	System.out.println(f);
	System.out.println(g);
	
}
public static void main(String[] args) {
	With_para4 W=new With_para4( 100,"Weldone",50,'A',55.45f,9604893245l);
	W.Line1();
	System.out.println("---------------------");
	With_para4 X=new With_para4(20,"Great",34,'B',90.34f,23458765l);
	X.Line1();
	
}

}
