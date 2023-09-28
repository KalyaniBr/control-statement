package stringclass;

public class Sample1 {
public static void main(String[] args) {
	String s1="velocity";
	String s2="Velocity";
	String s3="My name is rahul";
	String s4="abcabc";
	
	System.out.println(s1.length());
	
	System.out.println(s1.toUpperCase());
	
	System.out.println(s2.toLowerCase());
	
	System.out.println(s1.equals(s2));
	
	System.out.println(s1.equalsIgnoreCase(s2));
	
	System.out.println(s3.contains("is"));
	
	System.out.println("--------------------");
	
	System.out.println(s3.startsWith("my"));
	
	System.out.println(s3.endsWith("rahul"));
		
    System.out.println(s1.charAt(4));	
	
	System.out.println(s4.indexOf('b'));
	
	System.out.println(s4.lastIndexOf('a'));
	
	System.out.println(s3.replace("rahul", "ganesh")); //my name is ganesh
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}
