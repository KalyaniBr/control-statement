package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ex1_LinkedList {
public static void main(String[] args) {
	
	LinkedList ll=new LinkedList();
	
	ll.add(100);
	ll.add("Kalyani");
	ll.add(null);
	ll.add('A');
	
	System.out.println(ll.size());
	System.out.println(ll.contains(null));
	System.out.println(ll.isEmpty());
	System.out.println(ll.get(1));
	System.out.println(ll);
	
	System.out.println("----add info-----");
	
	ll.add(2,"Bramhankar");
	ll.add(4,100);
	System.out.println(ll);
	
	System.out.println("-----remove info------------");
	
	ll.remove(3);
	System.out.println(ll);
	
	System.out.println("-----update info---------");
	
	ll.set(4,200);
	System.out.println(ll);
	
	System.out.println("-----print info using iterator cursor-------");
	
	Iterator itr=ll.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("------print using Listiterator cursor----------");
	
	ListIterator litr=ll.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	
	System.out.println("-----print using for loop----------");
	for(int i=0;i<=ll.size()-1;i++)
	{
		System.out.println(ll.get(i));
	}
	
	System.out.println("-----print using foreach loop----------");
	
	for(Object O:ll)
	{
		System.out.println(O);
	}
	
	
	
	
	
	
}
}
