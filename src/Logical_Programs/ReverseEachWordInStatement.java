package Logical_Programs;

public class ReverseEachWordInStatement {
public static void main(String[] args) {
	
	String s1="My name is abc";
	String[]ar=s1.split(" ");    //{my(0) name(1) is(2) abc(3)
	
	for(int i=0;i<=ar.length-1;i++)
	{
		String org=ar[i];  //name
		String rev=reverseString(org);    //name-->eman
	
	System.out.print(rev+" ");  //ym eman
	
	}	
}

public static String reverseString(String org)
{
	String rev="";
	for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+org.charAt(i);
	}
	return rev;
}}