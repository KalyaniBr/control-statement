package PeacticeLogicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class Ex5 {public static void main(String[] args) {
	
	
	int a=334;
	
	String no=Integer.toString(a);
	String rev="";
	
	for(int i=no.length()-1;i>=0;i--)
	{
		rev=rev+no.charAt(i);
	}
	
	int x=Integer.parseInt(rev);
	
	System.out.println(x);
	
	
	
	
	
}

private static String charAt(int i) {
	// TODO Auto-generated method stub
	return null;
}}