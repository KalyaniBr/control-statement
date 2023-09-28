package stringclass;

public class Sample5 {
public static void main(String[] args) {
	
	String s1= "Beautiful";
	String s2="HANDSOME";
	String s3=" I am Brave";
	
	System.out.println(s1.length());
	
	System.out.println(s2.toLowerCase());
	
	System.out.println(s2.equals(s3));
	
	System.out.println(s3.equalsIgnoreCase(s1));
	
	System.out.println(s1.toUpperCase());
	
	System.out.println(s2.contains("S"));
	
	System.out.println(s3.startsWith("I"));
	
	System.out.println(s3.endsWith("Brave"));
	
	System.out.println(s3.charAt(3));
	
	System.out.println(s3.indexOf("a"));
	
	System.out.println(s3.lastIndexOf("a"));
	
	System.out.println(s3.replace("Brave", "Confident"));
	
}
}
