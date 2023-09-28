package arrays_ex;

public class example1 {
public static void main(String[] args) {
	
	// step 1:arrays declaration
	
	  int[]ar=new int[5]; //object creation
	//data type [] object name =new data type[no.of elements in array]
	
	
	 // step 2:array initialization
	  
	ar[0]=105;
	ar[1]=106;
	ar[2]=110;
	ar[3]=107;
	ar[4]=108;
	//ar[5]=109;
	
  //step 3: array usage
	
	System.out.println(ar[0]);
	System.out.println(ar.length); //i.e 5
	System.out.println(("-----------print all data from int array-----"));
	
  //for(int i=0;i<=4;i++)
 //}
//	System.out.println(i);
//}
	
	for(int i=0;i<=ar.length-1;i++)
	{ //4
		System.out.println(ar[i]);
	}
	
}
	
	
}
