package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Ex4_Arraylist {
public static void main(String[] args) {
	
 
	ArrayList ar=new ArrayList	();
	
  ar.add("kalyani")	;
  ar.add(1000);
  ar.add('A');
  ar.add(null);
  ar.add(9604893245l);
	
	System.out.println(ar);
	System.out.println(ar.contains(1000));
	System.out.println(ar.isEmpty());
	System.out.println(ar.size());
	System.out.println(ar.indexOf(null));
	System.out.println(ar.get(2));
	
	//add info to the arraylist---->right shift operation
	
	ar.add(1,2000);
	System.out.println(ar);
	
	//remove/delete info in between arraylist--left shift operation
	
	ar.remove(3);
	System.out.println(ar);
	
	//update or modify info into in between arraylist
	
	ar.set(0, "Bramhankar");
	System.out.println(ar);
	
	System.out.println("-----print all data using ListIterator cursur-----------");
	
	ListIterator litr= ar.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	
   System.out.println("----------print all data using iterator cursur");	
	
	Iterator itr=ar.iterator();
	while(itr.hasNext())
	{
		
	System.out.println(itr.next());	
	}
	
	System.out.println("-------print all data using for loop---------");
	for(int i=0;i<=ar.size()-1;i++)
	{
		System.out.println(ar.get(i));
	}
	
	System.out.println("---print all data using for each loop-----------");
	
	for(Object s1:ar)
	{
		System.out.println(s1);
	}
	
	
	
	
	
}
}
