package default_constructor;

public class Practice {

	
	int a;
	int b;
 Practice()
 {
	a=2;
	b=3;
 }
	
	public void add() 
	{
		System.out.println(a+b);
	}
public void sub() 
{
	System.out.println(b-a);
}
	
	public static void main(String[] args)
	{
		   Practice p=new Practice();
		//dataType Objectname =nerw Keyword for blank space  Constuctor
		p.add();
		p.sub();
		
		
		
	}
	
	
	
	
	
	
	
	
}

