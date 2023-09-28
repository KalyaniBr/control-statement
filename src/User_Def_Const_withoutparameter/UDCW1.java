package User_Def_Const_withoutparameter;

public class UDCW1 {

	//Ex.user defined constructor without parameter
	
	// step1:vasriable declaration
	
	int no1;
	int no2;
	
	//step:variable intialization
	//user defined constructor-->provided by user
	//use 1:variable intialization
	//use 2: copy all members of calss into object
	
	UDCW1() //Without/zero parameter constructor
	{
		no1=100;
		no2=200;
	}
	public void addition()
	{
		System.out.println(no1+no2);
	}
	
		
	
	public static void main(String[] args) {
		UDCW1 L=new UDCW1 ();
		L.addition();
      
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
}
