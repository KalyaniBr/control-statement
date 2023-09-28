package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
public static void main(String[] args) {
	
	TreeSet ts=new TreeSet();  //only homogeneous data
	ts.add(100);
	ts.add(105);   //No duplicate value and null value stored in this type
	ts.add(120);  //data will be arrenged in asecnding or in alphabeticle order
	ts.add(102);
	ts.add(104);
	ts.add(130);
	ts.add(190);
	
	System.out.println(ts);
	System.out.println(ts.contains(102));
	System.out.println(ts.size());
	System.out.println(ts.isEmpty());
	
	ts.remove(190);
	System.out.println(ts);
	
	System.out.println(ts.first());
	System.out.println(ts.last());
	
	ts.pollFirst();
	System.out.println(ts);
	
	ts.pollLast();
	System.out.println(ts);
	
	System.out.println("-----print all data using iterator cursor-----");
	
	Iterator itr=ts.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("----------print all data using for each loop--------");
	
	for(Object O:ts)
	{
		System.out.println(O);
	}
	
}
}
