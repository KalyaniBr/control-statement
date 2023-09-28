package Logical_Programs;

public class Ex11_Reverse_Num_without_String_Function {
public static void main(String[] args) {

	int a=12334567;
	int rev=0;
	
	for(int i=a;i>0;i=i/10)
	{
		int rem= i%10;
		
		rev=rev*10+rem;
		
	}
	
	System.out.println(rev);
	
	
	


}
}
