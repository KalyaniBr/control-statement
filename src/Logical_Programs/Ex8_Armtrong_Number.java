package Logical_Programs;

public class Ex8_Armtrong_Number {
public static void main(String[] args) {
	
int orgnum=153; //sum of power 3 o each digit in no
int sum=0; //27 152 153


  //153 ,15,0.1
for(int i=orgnum;i>0;i=i/10)    
{
	int rem=i%10; // 3 5
  sum=sum+(rem*rem*rem); 
}
if(orgnum==sum)
{
	System.out.println("Given num is armtrong no");
}
else
{
	System.out.println("given num is not armtrong no");
}
}
}