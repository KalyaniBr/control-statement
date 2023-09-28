package collection;

import java.util.TreeSet;

public class TreeSet2_Generic {
public static void main(String[] args) {
	
	TreeSet <String>ts=new TreeSet<String>();
	
	ts.add("Kalyani");
	ts.add("Jayashri");
	ts.add("Bramhankar");
	ts.add("Good Morning");
	ts.add("Good Night");
	
	System.out.println("---------print using foreach loop---------");
	
	for(String S1:ts)
	{
		System.out.println(S1);
	}
	
	
	
	
}
}
