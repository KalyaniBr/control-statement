package group1CS;

public class Newelase_if {
public static void main(String[] args) {
	int age=25;
	if(age>=75)
	{
		System.out.println("Old");
	}
	else if(age<=74 & age>=55) //74-55
	{
		System.out.println("senior citizens");
	}
	else if(age<=54 & age>=35) //54-35
	{
		System.out.println("Adult");
	}
	else if(age>=18 & age<=34)  //18-34
	{
		System.out.println("Young");
	}
	else
	{
		System.out.println(" Child");
	}
}
}
