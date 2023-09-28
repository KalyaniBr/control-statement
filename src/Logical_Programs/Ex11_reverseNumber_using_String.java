package Logical_Programs;

public class Ex11_reverseNumber_using_String {
public static void main(String[] args) {
	
	int orgNum=1234;
	String org=Integer.toString(orgNum);  //convert number to String
		String rev="";	
	for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+org.charAt(i);
	}
	int revNum=Integer.parseInt(rev); //convert string to number
	System.out.println(revNum);
}
}
