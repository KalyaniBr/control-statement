package collection;

import java.util.ArrayList;

public class Ex_2ArrayList {
public static void main(String[] args) {
	
	ArrayList A=new ArrayList();
	
	A.add("Bramhankar");
	A.add("Kalyani");
    A.add(2345);
    A.add(null);
    A.add('C');
    A.add(9604893245l);
    
	
	System.out.println(A.size());
	System.out.println(A.isEmpty());
	System.out.println(A.contains ('C'));
	System.out.println(A.get(5));
	
	System.out.println(A);
	
	
}
}
