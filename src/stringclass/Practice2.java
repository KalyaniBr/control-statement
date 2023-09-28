package stringclass;

public class Practice2 {
public static void main(String[] args) {
	
	String s="HELLO";
	String c="Heeee";
	String f="  Good";
	String v="778";
	String j="HEEEE";
	System.out.println(c.length());
	System.out.println(c.toUpperCase());
	System.out.println(s.toLowerCase());
System.out.println(f.contains("m"));	
System.out.println(c.equals(v));
System.out.println(v.indexOf("7"));
System.out.println(v.lastIndexOf("7"));
System.out.println(s.charAt(2));
System.out.println(c.concat(f));
System.out.println(s.substring(3));
System.out.println(f.substring(0,3));
System.out.println(f.equalsIgnoreCase(j));
System.out.println(v.replaceAll("7", "9"));
	System.out.println(f.trim());
	System.out.println(s.isEmpty());
	
	
}
}
