package stringclass;

public class Sample7 {

	
	public static void main(String[] args) {
		
		String s1= "velocity";
		String s2="VELOCITY";
		String s3= "My name is rahul";
		String s4="abcabcbac";
		String s5="";
		
		System.out.println(s1.isEmpty()); //False
		System.out.println(s5.isEmpty());  //true
		
		System.out.println(s1.concat(s2)); //velocityVelocity
		
		System.out.println(s1+s2); //velocityVELOCITY
		
		System.out.println(s1.substring(3,6));  //3-5
		
		System.out.println(s1.substring(4)); //city
		
		System.out.println("---------------------------------");
		
		System.out.println(s1.length());     //8
		
		System.out.println(s3.toUpperCase());  //MY NAME IS RAHUL
		
		System.out.println(s2.toLowerCase());  //velocity
		
		System.out.println(s1.equals(s2));  //false
		
		System.out.println(s1.equalsIgnoreCase(s2));  //true
		
		System.out.println(s3.contains("is")); //true
		
		System.out.println("---------------------------------");
		
		System.out.println(s3.startsWith("My")); //true
		
		System.out.println(s3.endsWith("rahul"));  //true
		
		System.out.println(s1.charAt(4)); //
		
		System.out.println(s4.indexOf('b')); //6
		
		System.out.println(s4.lastIndexOf('a')); //7
		
		System.out.println(s3.replace("rahul","ganesh" )); //My name is ganesh
		
		
		
	}
}
