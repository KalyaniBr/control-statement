package collection;

import java.util.ArrayList;

public class ArrayList_Generic {
public static void main(String[] args) {
	
	ArrayList <String>ar=new ArrayList<String>();
	
	ar.add("Kalyani");
    ar.add("Velocity");	
	ar.add("Hello");
	ar.add("Hii");
	
	System.out.println("-----print using foreach loop--------");
	for(String s:ar)
	{
		System.out.println(s);
	}
		
	
	
}
}
