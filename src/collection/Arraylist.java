package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist {
public static void main(String[] args) {
	
	ArrayList ar=new ArrayList();
	
	ar.add("Kalyani");
	ar.add(100);
	ar.add('A');
	ar.add(122.3f);
	ar.add("Bramhankar");
	
	System.out.println(ar.contains(100));
	System.out.println(ar.isEmpty());
	System.out.println(ar.get(0));
	System.out.println(ar.size());
	System.out.println(ar.indexOf('A'));
	
	
	//stem.out.println("Print using ListIterator");
	
	System.out.println("right shift operation");
	
	ar.add(1,200);
	
	//remove operation
	
	ar.remove(4);
	
	//update information
	
	ar.set(2,"Jayashri");
	
//using    ListIterator
	
	ListIterator ltr=ar.listIterator();
	While ltr.hasnext();
	{
		
	}
	
	
}
}
