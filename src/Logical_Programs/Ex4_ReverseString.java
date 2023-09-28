package Logical_Programs;

public class Ex4_ReverseString {
public static void main(String[] args) {
	
	// 1st way--using concatination operator
	
	String str="Kalyani";
	String rev=  " " ;    // -->to store reverse num
	
	
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(str);
	System.out.println(rev);
}
}
