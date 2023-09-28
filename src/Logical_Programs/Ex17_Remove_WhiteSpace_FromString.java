package Logical_Programs;

public class Ex17_Remove_WhiteSpace_FromString {
public static void main(String[] args) {
	
	String s="My Name Is Kaly ani i";
	
	//remove white spaces using regex
	
	s=s.replaceAll("\\s+", "");
	
	System.out.println("After removing spaces = "+s);
	
	
	
}
}
