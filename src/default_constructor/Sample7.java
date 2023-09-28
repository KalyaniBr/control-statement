package default_constructor;

public class Sample7 {

	int i=100;
	int j=200;
	public void k() {
		System.out.println(i+j);
		System.out.println(i*j);
		System.out.println(j/i);
		System.out.println(j-i);
		System.out.println(i+i+j);

	}
	
	public static void main(String[] args) {
		Sample7 Y=new Sample7();
		Y.k();
		
		
	}
	
	
	
	
	
	
}
