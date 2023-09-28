package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex6_ArrayList {
public static void main(String[] args) {
	
	ArrayList at=new ArrayList();
	
	at.add(100);
	at.add("GN");
	at.add(null);
	at.add('D');
	
	System.out.println(at);
	System.out.println(at.contains('D'));
	System.out.println(at.get(1));
	System.out.println(at.isEmpty());
	System.out.println(at.size());
	
	System.out.println("------add info------");
	
	at.add(1,"GM");
	at.add(2,"xyz");
	System.out.println(at);
	
	System.out.println("-------remove info-------");
	
	at.remove(0);
	at.remove(3);
	System.out.println(at);
	
	
	System.out.println("---using iterator----------");
	
	Iterator itr=at.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("-------using ListIterator--------");
	
	ListIterator litr=at.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	
	System.out.println("-----using for loop----------");
	
	for(int i=0;i<=at.size()-1;i++)
	{
		System.out.println(at.get(i));
	}
	System.out.println("-----using forEach loop----------");
	
	for(Object S:at)
	{
	System.out.println(S);
	}	
}
}
