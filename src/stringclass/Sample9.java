package stringclass;

public class Sample9 {
public static void main(String[] args) {
	
	String s1=new String("Kalyani");
	
	String s2=new String("Bramhankar");
	
	String s3="GOOD MORNING";
	
	String s4="Good Night";
	
	String s5="";
	
	System.out.println(s1.length());
	System.out.println(s4.length());
	
	System.out.println(s3.toUpperCase());
	System.out.println(s4.toLowerCase());
	
	System.out.println(s4.contains("Night"));
	
	System.out.println(s3.equals(s4));
	
	System.out.println(s3.equalsIgnoreCase(s4));
	
	System.out.println(s1.indexOf('n'));
	System.out.println(s2.indexOf('m'));
	
	System.out.println(s3.lastIndexOf('O'));
	System.out.println(s4.lastIndexOf('N'));
	
	System.out.println(s4.charAt(1));
	System.out.println(s1.charAt(6));
	
	System.out.println(s4.replace("Good","Bad"));
	System.out.println(s3.replace("MORNING", "EVENING"));
	
	System.out.println(s1.startsWith("k"));
	System.out.println(s2.endsWith("r"));
	
	System.out.println("----------------------------------------");
	
	System.out.println(s1.isEmpty());
	System.out.println(s2.isEmpty());
	System.out.println(s3.isEmpty());
	System.out.println(s5.isEmpty());
	
	System.out.println(s1.concat(s2));
	System.out.println(s1.concat(s4));
	
	System.out.println(s3+s4);
	System.out.println(s1+s2);
	
	System.out.println(s3.substring(4,8));
	System.out.println(s3.substring(2));
}
}
