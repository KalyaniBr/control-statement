package stringclass;

public class Sample10 {
public static void main(String[] args) {
	

	String s="PACKAGE";
	String g="package";
	String f="";
	String j="Hi iam Kalyani";
	
	System.out.println(s.equals(g));
	System.out.println(s.equalsIgnoreCase(g));
	System.out.println(s.toLowerCase());
	System.out.println(g.toUpperCase());
	System.out.println(s+g);
	System.out.println(s.concat(j));
	System.out.println(j.startsWith("Hi"));
	System.out.println(j.endsWith("Kalyani"));
	System.out.println(f.isEmpty());
	System.out.println(g.charAt(3));
	System.out.println(j.substring(0,4));
	System.out.println(j.charAt(5));
	System.out.println(j.replace("H","e"));
	System.out.println(j.indexOf("i"));
	System.out.println(j.lastIndexOf("i"));
	System.out.println(j.length());
	System.out.println(j.contains("iam"));
}
	
	
}
