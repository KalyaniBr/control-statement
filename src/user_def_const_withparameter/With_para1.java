package user_def_const_withparameter;

public class With_para1 {

	//user defined constructor with parameter
	int a;
	int b;
	//userdefined constructor with 2 int parameter
	//use1: initialise global variable using local variable
	//use2: copy all the ,embers of class into object
	
	With_para1(int n1,int n2)
	{
		a=n1; //assing local variableinfo into global variable
		b=n2;
	}
	public void T1() {
		System.out.println(a+b);
	}
	public void T2() {
		System.out.println(a*b);
	}
	public static void main(String[] args)
	{
		With_para1 doc=new With_para1(10,20);
		doc.T1();
		doc.T2();
		With_para1 loc=new With_para1(100,250);
		loc.T1();
		loc.T2();
	}
	
	
	
	
	
	
	
	
	
	
}
