package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class V1 {
public static void main(String[] args) {
	
	Vector V=new Vector ();
	
	V.add(null);
	V.add(null);
	V.add(100);
	V.add('A');
	V.add("Jay");
	V.add("Kal");
	V.add("Kal");
	
	System.out.println(V.contains("Kal"));
	System.out.println(V.size());
	System.out.println(V.indexOf("Kal"));
	System.out.println(V);
	
	System.out.println("-----using iterator--");
	
	Iterator itr =V. iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
			}
	
	System.out.println("--print using Enumerator------");
	
	Enumeration enu=V.elements();
	while(enu.hasMoreElements())
	{
		System.out.println(enu.nextElement());
	}
	
	System.out.println("--print  using Listiterator------");
	
	ListIterator ltr=V.listIterator();
	while (ltr.hasNext())
	{
		System.out.println(ltr.next());
	}
	
	System.out.println("using for each");
	
  for(Object D1:V)	
  {
	  System.out.println(D1);
  }
	
	
	
	
}
}
