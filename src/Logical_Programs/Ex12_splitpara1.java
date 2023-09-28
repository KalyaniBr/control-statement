package Logical_Programs;

public class Ex12_splitpara1 {
public static void main(String[] args) {
	
	String s1="my name is abc";
	
	String[]ar=s1.split(" ");
	
	System.out.println(ar[1]);
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.print(ar[i]);
	}
}
}
