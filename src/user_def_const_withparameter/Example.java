package user_def_const_withparameter;

public class Example {
int a;int b;int c;
String s;
Example(int e,int f,int g)
{
	a=e;
	b=f;
	c=g;
}
Example(String j)
{
	s=j;
}
		
public void add() 
{
	System.out.println(a+b);
}

public void sub() 
{
	System.out.println(a-c);
}
public void name() 
{
	System.out.println(s);
}

public static void main(String[] args) {
	
	Example ex=new Example(4,8,6);
	ex.add();
	ex.sub();
	
	Example dx=new Example("Kalyani");
	dx.name();
	
}



}
