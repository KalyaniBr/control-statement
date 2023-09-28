package stringclass;

public class String12 {
public static void main(String[] args) {
	
	String s="Kalyani";
	String s1="KALYANI";
	String s2="Bramhankar";
	
	System.out.println(s.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.length());
	System.out.println(s.isEmpty());
	System.out.println(s2.equals(s));
	System.out.println(s.equalsIgnoreCase(s1));
	System.out.println(s.indexOf("y"));
	System.out.println(s1.lastIndexOf("A"));
	System.out.println(s2.charAt(3));
	System.out.println(s1+s2);
	System.out.println(s.concat(s2));
	System.out.println(s1.replace("L", "M"));
	System.out.println(s2.substring(1,4));
	System.out.println(s2.contains("ram"));
	System.out.println(s1.startsWith("K"));
	System.out.println(s1.endsWith("I"));
	
	
	
	
	
	
	
	
}
}
