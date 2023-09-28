package stringclass;

public class Sample2 {
public static void main(String[] args) {
	String s1="kalyani";
	String s2="Kalyani";
	String s3="My name is radha";
	String s4="xyzxyz";
	
	
	System.out.println(s1.length());
	
	System.out.println(s4.length());
	
	System.out.println(s1.toUpperCase());
	
	System.out.println(s2.toLowerCase());
	
	System.out.println(s1.equals(s2));
	
	System.out.println(s1.equalsIgnoreCase(s2));
	
	System.out.println(s3.contains("name"));
	
	System.out.println(s3.contains("radha"));
	
	System.out.println(s3.startsWith("My"));
	
	System.out.println(s3.endsWith("radha"));
	
	System.out.println(s1.charAt(4));
	
	System.out.println(s3.charAt(6));
	
	System.out.println(s4.indexOf("b"));
	
	System.out.println(s4.lastIndexOf("a"));
	
	System.out.println(s3.replace("radha", "Kalyani"));
}
	
}
