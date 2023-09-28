package stringclass;

public class Ex1 {
public static void main(String[] args) {
	
	String s1="Kalyani";
	String s2="XYZ";
	
	System.out.println(s2.isEmpty());
	System.out.println(s1.contains("K"));
	System.out.println(s2.startsWith("x"));
	System.out.println(s1.endsWith("i"));
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toLowerCase());
	System.out.println(s1.indexOf("a"));
	System.out.println(s1.lastIndexOf("a"));
	System.out.println(s1.charAt(1));
	System.out.println(s1.substring(1,5));
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.concat(s2));
	System.out.println(s2.length());
	System.out.println(s1+s2);
	System.out.println(s1.replace("y", "a"));
}
}
