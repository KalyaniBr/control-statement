package Multiple_constructor_in_1class;

public class Example1 {
 int marks;
 String Name;
 float percentage;
 char grade;
 
 Example1()  //without parameter
 {
	 marks=100;
	 Name="Kalyani";
	 percentage=89.98f;
	 grade='A';
 }
 Example1(int a,String b,float c,char d) //user def. with string ,int, float, char parameters
 {
	 marks=a;
	 Name=b;
	 percentage=c;
	grade=d;
 }
 Example1(String t,int n)
 {
	 Name=t;
	 marks=n;
 }
 public void b1() {
	System.out.println(Name);
	System.out.println(marks);
	System.out.println(percentage);
	System.out.println(grade);
}
	public static void main(String[] args) {
		Example1 add=new Example1();
		add.b1();
	
		Example1 all=new Example1(100,"Good",35.46f,'Z');
		all.b1();
		
		Example1 few=new Example1("Jayashri",60);
		few.b1();
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
