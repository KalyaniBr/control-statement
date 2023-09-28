package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex5_ArrayList {
public static void main(String[] args) {
	
	ArrayList  ar=new ArrayList();
	
	ar.add("GM");
	ar.add(100);
	ar.add('g');
	ar.add(null);
	ar.add(53.36f);
	
	System.out.println(ar);
	System.out.println(ar.contains(100));
	System.out.println(ar.isEmpty());
	System.out.println(ar.size());
	System.out.println(ar.get(3));
	
	System.out.println("---add info to arrayList-----");
	
	ar.add(0,"GN");
	ar.add(6,null);
	ar.add(1,200);
	
	System.out.println(ar);
	
	System.out.println("---------remove info from arrayList-----");
	
	ar.remove(4);
	//ar.remove(7);
	System.out.println(ar);
	System.out.println("--using for loop----");
	
	for(int i=0;i<=ar.size()-1;i++)
	{
		System.out.println(ar.get(i));
	}
	
	System.out.println("----using for each loop---------");
	
	for(Object s1:ar)
	{
	System.out.println(s1);	
		
	}
	
	System.out.println("---using itreration cursur-------");
	
	Iterator itr= ar.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("-----using ListIteraor cursur----------");
	
	ListIterator litr =ar.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	
	
}
}
