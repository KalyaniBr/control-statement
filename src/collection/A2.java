package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A2 {
public static void main(String[] args) {
	
	ArrayList ar =new ArrayList();
	
	ar.add("Klayani");
	ar.add("Bramhanakr");
	ar.add(188);
	ar.add('s');
	
	System.out.println(ar.size());
	System.out.println(ar.contains(188));
	System.out.println(ar.get(1));
	System.out.println(ar.isEmpty());
	System.out.println(ar);
	
	System.out.println("update data");
	ar.set(0, "Jayashri");
	
	System.out.println("remove data");
	
	ar.remove(3);
	
	System.out.println("print using ListIterator");
	
	ListIterator ltr= ar.listIterator();
	while(ltr.hasNext())
	{
		System.out.println(ltr.next());
	}
	
	System.out.println("Print using Iterator");
	Iterator itr=ar.iterator();
	
	while (itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("Print using foreach loop");
	
	for(Object S1:ar)
	{
		System.out.println(S1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
