package default_constructor;

public class Sample5 {
static int S=50;
static String H="Kalyani Bramhankar";
	public void j1() {
		System.out.println(S);
	}
	public static void j2() {
		System.out.println(H);
	}
	
	
	public static void main(String[] args) {
		System.out.println(H);
		System.out.println(S);
		j2();
		Sample5 D=new Sample5();
		D.j1();
	//Sample5-->classname-->datatype
	//D-->objectname-->to identify or refer object
	//new-->keyword-->to create blank or empty space
	//Sample5-->constructor-->copy all the membersof class into object
	//here sample5 is defalt constructor-->provided by compilar
			
	}
	
	
	
}
