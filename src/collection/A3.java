package collection;

import java.util.ArrayList;

public class A3 {
public static void main(String[] args) {
	
	ArrayList<String> ar=new ArrayList<String>();
	
	ar.add("Jay");
	ar .add("100");
	ar.add("Meena");
	
	System.out.println("Print using foreach loop");
	
	for(String s1:ar)
	{
		System.out.println(s1);
	}
}
}
