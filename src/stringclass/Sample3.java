package stringclass;

public class Sample3 {
public static void main(String[] args) {
	
	String s1="GANESH";
	String s2= "I am Student";
	String s3= "ganesh";
	String s4="abccba";
	
	System.out.println(s1.length());
	System.out.println(s2.length());
	System.out.println(s3.length());
	System.out.println(s4.length());
	
	System.out.println(s4.toUpperCase());
	System.out.println(s1.toLowerCase());
	
	System.out.println(s1.equals(s3));
	
	System.out.println(s1.equalsIgnoreCase(s3));
	
	System.out.println(s2.contains("am"));
	
	System.out.println(s3.charAt(5));
	System.out.println(s4.charAt(3));
	
	System.out.println(s4.indexOf("a"));
    System.out.println(s3.indexOf("h"));
	
	System.out.println(s4.lastIndexOf("a"));
	
	System.out.println(s2.startsWith("I"));
	System.out.println(s4.endsWith("a"));
	System.out.println(s4.endsWith("h"));
	
    System.out.println(s4.replace("abc", "efg"));
	
	
	
	
	
}
}
