package Logical_Programs;

public class Ex9_Find_Total_no_Of_WhiteSpacesinString {
public static void main(String[] args) {
	
	String str="K A  L Y A  N  I";
	int count=0;
	for(int i=0;i<str.length()-1;i++)
	{
		char s1=str.charAt(i);
	
		if(s1==' ')
		{
			count++;
	}
}
System.out.println("no of spaces in given string ="+count);
}
}
