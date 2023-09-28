package Logical_Programs;

public class Ex13_printStatementInreverseOrder {
public static void main(String[] args) {
	
	String s1="my name is abc";
	String []ar=s1.split("");
	
	System.out.println("---------------");
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.print(ar[i]+"");
	}
}
}
