package group1CS;

public class Else_if4 {
public static void main(String[] args) {
   int age=30;
   if( age>=18)
   { 
	   System.out.println( "Young");
   }
   else if(age>=19 & age<=35) //19-35
   {
	   System.out.println("adult");
   }
   else if(age>=36 & age<=70) //36-70
   {
	   System.out.println("senior citizen");
}
   else if(age>=71 & age<=100)
   {
	   System.out.println("Old");
   }
else 
{System.out.println("Child");
}
}
}