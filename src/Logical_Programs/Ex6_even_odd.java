package Logical_Programs;

import java.util.Scanner;

public class Ex6_even_odd {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enrer no:");
	int num=scan.nextInt();     //accepts int input from user
	
	if(num%2==0)
	{
		System.out.println("given no. is even");
	}
	else
	{
		System.out.println("given no. is odd");
	}
}
}
