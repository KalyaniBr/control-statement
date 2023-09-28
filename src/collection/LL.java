package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LL {
public static void main(String[] args) {
	
	LinkedList ll=new LinkedList();
	
	ll.add("Kal");
	ll.add("Day");
	ll.add(null);
	ll.add("Day");
	ll.add(199);
	
	System.out.println("print using list iterator");
	
	ListIterator ltr =ll.listIterator ();
	while (ltr.hasNext())
	{
		System.out.println(ltr.next());
	}
	
	Iterator itr=ll.iterator();
	while (itr.hasNext())
{
		System.out.println(itr.next());
			}
	
	
	
	
	
	
	
}
}
