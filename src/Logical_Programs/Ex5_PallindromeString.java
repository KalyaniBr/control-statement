package Logical_Programs;

public class Ex5_PallindromeString {
public static void main(String[] args) {
	
	String str="madam";
	String rev="";
	
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	

  if(str.equals(rev))
  {
   System.out.println("given string is Pallindrome");
 }
  else
  {
	  System.out.println("Given string is not a pallindrome");
  }
}
}