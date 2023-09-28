package Logical_Programs;

import java.util.Scanner;

public class Ex7_Fact_Of_Num {
public static void main(String[] args) {
	
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter No");
	
	int Num=scan.nextInt();
	
	int fact=1;
	
	for(int i=Num;i>=1;i--)
	{
		fact=fact*i;
	}
	System.out.println(fact);
}
}
