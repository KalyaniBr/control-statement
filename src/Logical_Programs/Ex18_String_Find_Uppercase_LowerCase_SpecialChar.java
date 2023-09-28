package Logical_Programs;

public class Ex18_String_Find_Uppercase_LowerCase_SpecialChar {
public static void main(String[] args) {
	
	String s="Kaldf@1234";
	
	int UC=0,LC=0,SC=0,NU=0;
	
	for(int i=0;i<=s.length()-1;i++)
	{
		char c  =s.charAt(i);
		
		if(Character.isUpperCase(c))
		{
			UC++;
		}
		else if(Character.isLowerCase(c))
		{
			LC++;
		}
		else if(Character.isDigit(c))
		{
			NU++;
		}
	}
	
	System.out.println(NU);
	
	System.out.println(LC);
	System.out.println(UC);
	
	
	
	
}
}
