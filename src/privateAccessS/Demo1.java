package privateAccessS;

public class Demo1 {

private int a;
private String b;
	
	private Demo1()
	{
		a=100;
		b="Kalyani";
	}
	private void A1() {
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Demo1 Moon=new Demo1();
		Moon.A1();
		System.out.println(Moon.a);
		System.out.println(Moon.b);
		
	}
	
	
	
	
	
	
	
}
