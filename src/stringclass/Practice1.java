package stringclass;

public class Practice1 {
public static void main(String[] args) {
	
	String s1="velocity";
	String s2="ABCD";
	String s3="abcd";
	String s4="my name is abc";
	String s5="abcabab";
	String s6="    xyz";


	System.out.println(s6);
	System.out.println(s6.trim());//use to cut space before String


	System.out.println(s1.isEmpty());   //

	System.out.println(s4.replace("abc", "xyz"));

	System.out.println(s2.concat(s3));
	System.out.println(s2+s3);

	System.out.println(s1.substring(2, 5)); //2-4
	System.out.println(s1.substring(6));

	System.out.println(s5.lastIndexOf('a'));
	System.out.println(s5.indexOf('b'));   //1

	System.out.println(s1.charAt(3));    //v

	System.out.println("-------------------");

	System.out.println(s1.length()); 
	
	
	
	
	
	
}
}
