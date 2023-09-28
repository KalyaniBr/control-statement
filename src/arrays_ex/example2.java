package arrays_ex;

public class example2 {

	public static void main(String[] args) {
		
	String[]ar=new String[4];	//0 to 3
		
	ar[0]="Kalyani";	
	ar[1]="Jayashri";	
	ar[2]="Gayatri";
	ar[3]="Ritesh";	
		
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar.length);
		
		System.out.println("----print all data ------------");
	//	for(int i=0;i<=3;i++) (if we have to print all values instate of writing last no i.e 3 we write ( cr.lenth-1)
	//	{
	//		System.out.println(ar[i]);
	//	}
		
	for(int i=0;i<=ar.length-1;i++)	
	{
		System.out.println(ar[i]);
	}
	}	
	
}
