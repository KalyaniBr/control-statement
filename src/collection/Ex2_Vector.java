package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex2_Vector {
public static void main(String[] args) {
	
	Vector V=new Vector();
	
	V.add("xyz");
	V.add(100);
	V.add('A');
	V.add(null);
	V.add("");
	
	System.out.println("-----------add info---------");
	V.add(5,"wl");
	System.out.println(V);
	
	System.out.println("-----remove--------");
	V.remove(4);
	System.out.println(V);
	
	System.out.println("-------update---------");
	V.set(2,'B');
	
	System.out.println("----print using for loop------");
	
	for(int i=0;i<=V.size()-1;i++)
	{
		System.out.println(V.get(i));
	}
	
	System.out.println("--------using for each loop--------");
	for(Object a:V)
	
	{
		System.out.println(a);
	}
	
	System.out.println("--------using Iterator cursor------");
	
	Iterator itr=V.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("--------using ListIterator cursor-------");
	
	ListIterator litr=V. listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	System.out.println("-------using Enumeration cusor----------");
	 Enumeration enu=V.elements();
	while(enu.hasMoreElements())
	{
		System.out.println(enu.nextElement());
	}
	
	System.out.println("----print data using for loop-----");
	for(int i=0;i<=V.size()-1;i++)
	{
		System.out.println(V.get(i));
	}
	
	System.out.println("-----print data using foreach loop----------");
	for(Object v:V)
	{
		System.out.println(v);
	}
}
}
