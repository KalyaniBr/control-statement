package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet2 {
public static void main(String[] args) {
	
	ArrayList al=new ArrayList();
	al.add("Kalyani");
	al.add("Kalyani");
	al.add(null);
	al.add(100);
	al.add(null);
	al.add(null);
	al.add(100);
	
	System.out.println(al);
	
	HashSet hs=new HashSet(al);
	
	System.out.println(hs);
	
	
}
}
