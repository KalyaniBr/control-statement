package collection;

import java.util.Vector;

public class Vector_Generic {
public static void main(String[] args) {
	
	Vector<Integer> vr=new Vector<Integer>();
	
	vr.add(100);
	vr.add(388);
	//vr.add(null);
	vr.add(345);
	vr.add(345);
	vr.add(7654);
	
 System.out.println("---print data using foreach loop---------");
 for(Integer I:vr)
 {
	 System.out.println(I);
 }
 
 
}
}
