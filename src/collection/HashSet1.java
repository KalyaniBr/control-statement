package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
public static void main(String[] args) {
	
	HashSet hs=new HashSet();
	
	hs.add(100);
	hs.add(null);  //single null allowded
	hs.add("Kalyani");//Duplicate dosent allow
	hs.add(100);
	hs.add(null);  //storage type :Hashtable
	
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	System.out.println(hs.contains(100));
	
	hs.remove(null);
	System.out.println(hs);
	
	System.out.println("----print all data using iterator cursor---------");
	
	Iterator itr= hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("-----print all data using foreach loop----------");
	
	for(Object A:hs)
	
	{
		System.out.println(A);
	}
	
	
	
	
	
	
}
}
