package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex1_Vector {
public static void main(String[] args) {
	
	Vector V=new Vector();
	
	V.add(100);
	V.add("Kalyani");
	V.add("Bramhankar");
	V.add(null);
	V.add('A');
	V.add(64.376f);
	
	System.out.println(V);
	System.out.println(V.size());
	System.out.println(V.isEmpty());
	System.out.println(V.contains(null));
	System.out.println(V.get(5));
	
	System.out.println("------add----------");
	V.add(2,"Jayashri");
	V.add(4,'B');
	System.out.println(V);
	
	System.out.println("------remove----------");	
	V.remove(3);
	System.out.println(V);
	
	System.out.println("--update-----------");
	V.set(5, 65.67f);
	System.out.println(V);
	
	System.out.println("-----using itrator cursor--");
	Iterator itr=V. iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		
	System.out.println("----using Listiterator cursor---------");
	ListIterator litr=V.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	
	System.out.println("---using for loop------");
	for(int i=0;i<=V.size()-1;i++)
	{
		System.out.println(V.get(i));
	}
	
	System.out.println("------using for each loop----------");
	for(Object a:V)
	{
		System.out.println((a));
	}
	
	System.out.println("---using enumeration cursor-------");

	Enumeration enu=V.elements();
			while(enu.hasMoreElements())
			{
				System.out.println(enu.nextElement());
			}
	
	
	
}
}
