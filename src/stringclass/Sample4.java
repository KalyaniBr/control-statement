package stringclass;

public class Sample4 {
public static void main(String[] args) {
	
	String s1="BRAMHANKAR";
	String s2="kalyani";
	String s3= " I am on the way";
	String s4="KALYANI";
	System.out.println(s1.length());
	System.out.println(s2.length());
	System.out.println(s3.length());
	
	System.out.println(s2.equals(s4));
	System.out.println(s2.equalsIgnoreCase(s4));
	
	System.out.println(s2.toUpperCase());
	System.out.println(s4.toLowerCase());
	
	System.out.println(s2.startsWith("k"));
	System.out.println(s3.endsWith("y"));
	
	System.out.println(s2.contains("a"));
	
	System.out.println(s3.charAt(3));
	System.out.println(s2.charAt(4));
	
	System.out.println(s2.indexOf("a"));
	System.out.println(s3.indexOf("I"));
	System.out.println(s2.lastIndexOf("a"));
	
	System.out.println(s3.replace("on", "off"));
			
}
	
}
