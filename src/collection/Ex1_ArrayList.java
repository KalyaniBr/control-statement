package collection;

import java.util.ArrayList;

public class Ex1_ArrayList {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList(); //initial capacity 10
		
		ar.add("Kalyani");  //any no. of null values allowded.
		ar.add(101);        //allows duplicates
		ar.add('A');
		ar.add(3.5f);
		ar.add(null);
		ar.add(800);
		ar.add(800);
		ar.add(800);
	System.out.println(ar);
	System.out.println(ar.size()); //7
	System.out.println(ar.isEmpty());  //false
	System.out.println(ar.contains('A'));  //true
	System.out.println(ar.get(5)); //null
		
	}
}
