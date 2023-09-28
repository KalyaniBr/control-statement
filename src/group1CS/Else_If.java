package group1CS;

public class Else_If {
	public static void main(String[] args) {
		int E= 39;
		if(E>=75)
		{
			System.out.println("Pass with Distinction");
		}
		else if(E<=74 & E>=60)
		{
			System.out.println("1st Class");
		}
		else if(E<=59 & E>=55 )
		{
			System.out.println("2nd Class");
		}
		else if(E<=54 & E>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	
}
}