package collection;

import java.util.ArrayList;

public class Ex3_ArrayList {
public static void main(String[] args) {
	
	ArrayList K=new ArrayList();
	
	K.add("Software");
	K.add(12345);
	K.add('K');
	K.add(null);
	
	System.out.println(K.size());
	System.out.println(K);
	System.out.println(K.contains('A'));
	System.out.println(K.isEmpty());
	System.out.println(K.get(0));
}
}
