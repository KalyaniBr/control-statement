package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkeHashSet {
public static void main(String[] args) {
	
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add("Kalyani");
	lhs.add(100);
	lhs.add('A');
	lhs.add(54.45f);
	lhs.add(null);
	lhs.add(100);  //one null value allowded
	lhs.add(100);//duplicate value is not allowdede
	
	
	System.out.println(lhs);
	System.out.println(lhs.isEmpty());
	System.out.println(lhs.contains('A'));
	System.out.println(lhs.size());
	
	lhs.remove(null);
	System.out.println(lhs);
	
	System.out.println("----print all data using cursor----------");
	
	Iterator itr=lhs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("----print all data using foreach loop----------");
	for(Object K:lhs)
	{
		System.out.println(K);
	}
	
}
}
