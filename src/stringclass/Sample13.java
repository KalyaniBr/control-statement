package stringclass;

public class Sample13 {
	public static void main(String[] args) {
		
	
   String name="Kalyani";
   String Class="B.sc";
   String me="Kalai";
   String k="Kali";
   
  System.out.println(name.equals(Class));
   System.out.println(name.indexOf("i"));
   System.out.println(name.charAt(4));
   System.out.println(name.toUpperCase());
   System.out.println(name.toLowerCase());
   System.out.println(name.lastIndexOf("a"));
   System.out.println(name.concat(me));
   System.out.println(name.equalsIgnoreCase(k));
   System.out.println(name.startsWith("K"));
   System.out.println(name.endsWith("i"));
   System.out.println(name.isEmpty());
   System.out.println(name.length());
   System.out.println(name.substring(4));
   System.out.println(name.replace("K", "S"));
   System.out.println(me+k);
   System.out.println(name.contains("C"));
	}   
}
